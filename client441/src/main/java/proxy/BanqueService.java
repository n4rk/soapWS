
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://bankWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://bankWS/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://bankWS/", className = "proxy.ConvertResponse")
    @Action(input = "http://bankWS/BanqueService/ConvertRequest", output = "http://bankWS/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod(operationName = "GetAccount")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetAccount", targetNamespace = "http://bankWS/", className = "proxy.GetAccount")
    @ResponseWrapper(localName = "GetAccountResponse", targetNamespace = "http://bankWS/", className = "proxy.GetAccountResponse")
    @Action(input = "http://bankWS/BanqueService/GetAccountRequest", output = "http://bankWS/BanqueService/GetAccountResponse")
    public Compte getAccount(
        @WebParam(name = "code", targetNamespace = "")
        int code);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod(operationName = "ListAccounts")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ListAccounts", targetNamespace = "http://bankWS/", className = "proxy.ListAccounts")
    @ResponseWrapper(localName = "ListAccountsResponse", targetNamespace = "http://bankWS/", className = "proxy.ListAccountsResponse")
    @Action(input = "http://bankWS/BanqueService/ListAccountsRequest", output = "http://bankWS/BanqueService/ListAccountsResponse")
    public List<Compte> listAccounts();

}
