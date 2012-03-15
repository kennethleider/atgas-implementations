
package org.atgas.sync.media.beyondtv.webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "BTVLicenseManagerSoap", targetNamespace = "http://www.snapstream.com/WebService")
@XmlSeeAlso({
    org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.ObjectFactory.class,
    org.atgas.sync.media.beyondtv.webservices.types.ObjectFactory.class
})
public interface BTVLicenseManagerSoap {


    /**
     * 
     * @param username
     * @param networkLicense
     * @param password
     * @return
     *     returns org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag
     */
    @WebMethod(operationName = "Logon", action = "http://www.snapstream.com/WebService/Logon")
    @WebResult(name = "LogonResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "Logon", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.Logon")
    @ResponseWrapper(localName = "LogonResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogonResponse")
    public PVSPropertyBag logon(
        @WebParam(name = "networkLicense", targetNamespace = "http://www.snapstream.com/WebService")
        String networkLicense,
        @WebParam(name = "username", targetNamespace = "http://www.snapstream.com/WebService")
        String username,
        @WebParam(name = "password", targetNamespace = "http://www.snapstream.com/WebService")
        String password);

    /**
     * 
     * @param authTicket
     * @param newPassword
     * @param oldPassword
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ChangePassword", action = "http://www.snapstream.com/WebService/ChangePassword")
    @WebResult(name = "ChangePasswordResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "ChangePassword", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.ChangePassword")
    @ResponseWrapper(localName = "ChangePasswordResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.ChangePasswordResponse")
    public boolean changePassword(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket,
        @WebParam(name = "oldPassword", targetNamespace = "http://www.snapstream.com/WebService")
        String oldPassword,
        @WebParam(name = "newPassword", targetNamespace = "http://www.snapstream.com/WebService")
        String newPassword);

    /**
     * 
     * @param authTicket
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "RenewLogonSession", action = "http://www.snapstream.com/WebService/RenewLogonSession")
    @WebResult(name = "RenewLogonSessionResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "RenewLogonSession", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.RenewLogonSession")
    @ResponseWrapper(localName = "RenewLogonSessionResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.RenewLogonSessionResponse")
    public boolean renewLogonSession(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param username
     * @param networkLicense
     * @param password
     * @return
     *     returns org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag
     */
    @WebMethod(operationName = "LogonRemote", action = "http://www.snapstream.com/WebService/LogonRemote")
    @WebResult(name = "LogonRemoteResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "LogonRemote", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogonRemote")
    @ResponseWrapper(localName = "LogonRemoteResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogonRemoteResponse")
    public PVSPropertyBag logonRemote(
        @WebParam(name = "networkLicense", targetNamespace = "http://www.snapstream.com/WebService")
        String networkLicense,
        @WebParam(name = "username", targetNamespace = "http://www.snapstream.com/WebService")
        String username,
        @WebParam(name = "password", targetNamespace = "http://www.snapstream.com/WebService")
        String password);

    /**
     * 
     * @param clientToken
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "AcceptAuthenticateRequest", action = "http://www.snapstream.com/WebService/AcceptAuthenticateRequest")
    @WebResult(name = "AcceptAuthenticateRequestResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "AcceptAuthenticateRequest", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.AcceptAuthenticateRequest")
    @ResponseWrapper(localName = "AcceptAuthenticateRequestResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.AcceptAuthenticateRequestResponse")
    public byte[] acceptAuthenticateRequest(
        @WebParam(name = "clientToken", targetNamespace = "http://www.snapstream.com/WebService")
        byte[] clientToken);

    /**
     * 
     * @param oldClientToken
     * @param clientToken
     * @return
     *     returns byte[]
     */
    @WebMethod(operationName = "AcceptClientResponse", action = "http://www.snapstream.com/WebService/AcceptClientResponse")
    @WebResult(name = "AcceptClientResponseResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "AcceptClientResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.AcceptClientResponse")
    @ResponseWrapper(localName = "AcceptClientResponseResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.AcceptClientResponseResponse")
    public byte[] acceptClientResponse(
        @WebParam(name = "oldClientToken", targetNamespace = "http://www.snapstream.com/WebService")
        byte[] oldClientToken,
        @WebParam(name = "clientToken", targetNamespace = "http://www.snapstream.com/WebService")
        byte[] clientToken);

    /**
     * 
     * @param networkLicense
     * @param clientToken
     * @return
     *     returns org.atgas.sync.media.beyondtv.webservices.types.PVSPropertyBag
     */
    @WebMethod(operationName = "LogonWindowsAuth", action = "http://www.snapstream.com/WebService/LogonWindowsAuth")
    @WebResult(name = "LogonWindowsAuthResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "LogonWindowsAuth", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogonWindowsAuth")
    @ResponseWrapper(localName = "LogonWindowsAuthResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogonWindowsAuthResponse")
    public PVSPropertyBag logonWindowsAuth(
        @WebParam(name = "networkLicense", targetNamespace = "http://www.snapstream.com/WebService")
        String networkLicense,
        @WebParam(name = "clientToken", targetNamespace = "http://www.snapstream.com/WebService")
        byte[] clientToken);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PrincipalServerName", action = "http://www.snapstream.com/WebService/PrincipalServerName")
    @WebResult(name = "PrincipalServerNameResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "PrincipalServerName", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.PrincipalServerName")
    @ResponseWrapper(localName = "PrincipalServerNameResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.PrincipalServerNameResponse")
    public String principalServerName();

    /**
     * 
     * @param clientToken
     */
    @WebMethod(operationName = "CleanupLogin", action = "http://www.snapstream.com/WebService/CleanupLogin")
    @RequestWrapper(localName = "CleanupLogin", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.CleanupLogin")
    @ResponseWrapper(localName = "CleanupLoginResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.CleanupLoginResponse")
    public void cleanupLogin(
        @WebParam(name = "clientToken", targetNamespace = "http://www.snapstream.com/WebService")
        byte[] clientToken);

    /**
     * 
     * @param ticket
     */
    @WebMethod(operationName = "Logoff", action = "http://www.snapstream.com/WebService/Logoff")
    @RequestWrapper(localName = "Logoff", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.Logoff")
    @ResponseWrapper(localName = "LogoffResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogoffResponse")
    public void logoff(
        @WebParam(name = "ticket", targetNamespace = "http://www.snapstream.com/WebService")
        String ticket);

    /**
     * 
     * @param authTicket
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetPermissionsForTicket", action = "http://www.snapstream.com/WebService/GetPermissionsForTicket")
    @WebResult(name = "GetPermissionsForTicketResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetPermissionsForTicket", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.GetPermissionsForTicket")
    @ResponseWrapper(localName = "GetPermissionsForTicketResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.GetPermissionsForTicketResponse")
    public String getPermissionsForTicket(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @param authTicket
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "CanChangePassword", action = "http://www.snapstream.com/WebService/CanChangePassword")
    @WebResult(name = "CanChangePasswordResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "CanChangePassword", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.CanChangePassword")
    @ResponseWrapper(localName = "CanChangePasswordResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.CanChangePasswordResponse")
    public boolean canChangePassword(
        @WebParam(name = "authTicket", targetNamespace = "http://www.snapstream.com/WebService")
        String authTicket);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetVersionNumber", action = "http://www.snapstream.com/WebService/GetVersionNumber")
    @WebResult(name = "GetVersionNumberResult", targetNamespace = "http://www.snapstream.com/WebService")
    @RequestWrapper(localName = "GetVersionNumber", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.GetVersionNumber")
    @ResponseWrapper(localName = "GetVersionNumberResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.GetVersionNumberResponse")
    public String getVersionNumber();

    /**
     * 
     * @param macAddress
     * @param authticket
     */
    @WebMethod(operationName = "LogLinkInfo", action = "http://www.snapstream.com/WebService/LogLinkInfo")
    @RequestWrapper(localName = "LogLinkInfo", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogLinkInfo")
    @ResponseWrapper(localName = "LogLinkInfoResponse", targetNamespace = "http://www.snapstream.com/WebService", className = "org.atgas.sync.media.beyondtv.webservices.btvlicensemanager.LogLinkInfoResponse")
    public void logLinkInfo(
        @WebParam(name = "macAddress", targetNamespace = "http://www.snapstream.com/WebService")
        String macAddress,
        @WebParam(name = "authticket", targetNamespace = "http://www.snapstream.com/WebService")
        String authticket);

}
