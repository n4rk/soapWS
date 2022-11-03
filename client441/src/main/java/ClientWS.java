import proxy.BankWS;
import proxy.BanqueService;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BankWS().getBanqueServicePort();
        System.out.println(stub.convert(9500));
        Compte cp = stub.getAccount(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
    }
}
