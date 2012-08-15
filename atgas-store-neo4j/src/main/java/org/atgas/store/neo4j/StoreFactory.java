package org.atgas.store.neo4j;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import org.atgas.store.Change;
import org.atgas.store.JSONCollector;
import org.atgas.store.Store;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.kernel.EmbeddedGraphDatabase;

public class StoreFactory {
    public static final String DB_PATH = "repository/neo4j";
    public static final Map<String, String> OPTIONS = Collections.singletonMap("allow_store_upgrade","true");
    public static final InputStream BUILT_INS = StoreFactory.class.getResourceAsStream("/org/atgas/store/standardThings.json");
   
    
    private static void registerShutdownHook( final GraphDatabaseService graphDb )
    {
        // Registers a shutdown hook for the Neo4j instance so that it
        // shuts down nicely when the VM exits (even if you "Ctrl-C" the
        // running example before it's completed)
        Runtime.getRuntime().addShutdownHook( new Thread()
        {
            @Override
            public void run()
            {
                graphDb.shutdown();
            }
        } );
    }

    public static Store create() throws Exception {
       return create(DB_PATH, OPTIONS, new JSONCollector(BUILT_INS));
    }
    
    public static Store create(String path, Map<String, String> options, Callable<Change> baselineCollector) throws Exception {
        EmbeddedGraphDatabase database = new EmbeddedGraphDatabase( path, options);
        registerShutdownHook( database );

        StoreImplementation retval = new StoreImplementation(database);
        
        if (baselineCollector != null) {
            final Change baseline = baselineCollector.call();
            retval.addThings(baseline.getAdds());
            retval.removeThings(baseline.getRemoves());
        }
        return retval;
    }
}
