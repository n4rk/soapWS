package bankWS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

// POJO (Plain Old Java Object)
@WebService(serviceName = "BankWS")
public class BanqueService {
    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant*10.54;
    }
    @WebMethod(operationName = "GetAccount")
    public Compte getCompte(@WebParam(name = "code") int code) {
        return new Compte(code, Math.random()*9999, new Date());
    }
    @WebMethod(operationName = "ListAccounts")
    public List<Compte> listeComptes() {
        return List.of(
                new Compte(1, Math.random()*9999, new Date()),
                new Compte(2, Math.random()*9999, new Date()),
                new Compte(3, Math.random()*9999, new Date())
        );
    }
}
