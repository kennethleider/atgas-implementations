package org.atgas.store.neo4j;

import java.util.*;
import java.util.Map.Entry;
import org.atgas.store.ProxyRelationship;
import org.atgas.store.Relationship;
import org.atgas.store.Store;
import org.atgas.store.Thing;
import org.neo4j.cypher.javacompat.ExecutionEngine;
import org.neo4j.cypher.javacompat.ExecutionResult;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.index.Index;

public class StoreImplementation implements Store {

    private final GraphDatabaseService database;

    StoreImplementation(GraphDatabaseService database) {
        this.database = database;
    }

    public void addThings(Collection<Thing> things) {
        addThings(things.toArray(new Thing[things.size()]));
    }
    
    @Override
    public void addThings(Thing... things) {
        Transaction tx = database.beginTx();
        try {
            Index<Node> index = database.index().forNodes("atgas");
                        
            for (Thing thing : things) {
                Node node = findByID(thing.getID());
                // The id, source and standard cannot change once set.
                if (node == null) {
                    node = database.createNode();
                    String id = thing.getID();
                    node.setProperty("atgas-id", thing.getID());
                    index.add(node, "id", thing.getID());
                    index.add(node, "standard", thing.getStandardID());
                    index.add(node, "source", thing.getSourceID());
                }

                // Always update the properties
                for (String key : thing.getProperties()) {
                    node.setProperty(key, thing.get(key));
                }
                
                node.setProperty("atgas-standard", thing.getStandardID());                
                node.setProperty("atgas-source", thing.getSourceID());
            }
            
            for (Thing thing : things) {
                Node node = findByID(thing.getID());
                for (Relationship relationship : thing.getRelationships()) {
                    Node target = findByID(relationship.getTargetID());
                    node.createRelationshipTo(target, new AtgasRelationshipType(relationship.getType().name()));
                }
            }
            tx.success();
        } finally {
            tx.finish();
        }
    }

    private Node findByID(String sourceID) {
        Index<Node> index = database.index().forNodes("atgas");
        return index.get("id", sourceID).getSingle();
    }

    public void removeThings(Collection<Thing> things) {
        removeThings(things.toArray(new Thing[things.size()]));
    }
        
    @Override
    public void removeThings(Thing... things) {
        // TODO Auto-generated method stub
    }

    @Override
    public void addRelationships(Relationship... relationships) {
        // TODO Auto-generated method stub
    }

    @Override
    public void removeRelationships(Relationship... relationships) {
        // TODO Auto-generated method stub
    }

    @Override
    public Set<Thing> query(String query) {
        LinkedHashSet<Thing> retval = new LinkedHashSet<Thing>();
        ExecutionEngine engine = new ExecutionEngine( database );
        ExecutionResult result = engine.execute(query);
        for (Iterator<Map<String, Object>> it = result.iterator(); it.hasNext();) {
            Map<String, Object> row = it.next();
            for (Object object : row.values()) {
                if (object instanceof Node) {
                    retval.add(toThing(((Node)object)));
                }
            }    
        }
        
        return retval;
    }

    private Thing toThing(Node node) {
        String id = (String) node.getProperty("atgas-id");
        String standard = (String) node.getProperty("atgas-standard");
        String source = (String) node.getProperty("atgas-source");
        Thing retval = new Thing(id, standard, source);
        for(String key :node.getPropertyKeys()) {
            if (!key.startsWith("atgas-")) {
                retval.setProperty(key, node.getProperty(key));
            }
        }
        for (org.neo4j.graphdb.Relationship relationship : node.getRelationships(Direction.OUTGOING)) {
            final Node otherNode = relationship.getOtherNode(node);
            retval.addRelationship(new ProxyRelationship(relationship.getType().name(),
                                                         (String) otherNode.getProperty("atgas-id"),
                                                         (String) otherNode.getProperty("atgas-standard"),
                                                         (String) otherNode.getProperty("atgas-source")));
        }
        
        return retval;
    }
    
    @Override
    public Set<Thing> query(String query, String queryLanguage) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Set<String> supportedQueryLanguages() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void close() {
        database.shutdown();
    }

    @Override
    protected void finalize() throws Throwable {
        close();
    }
    
    
    public GraphDatabaseService getDatabase() {
        return database;
    }
}
