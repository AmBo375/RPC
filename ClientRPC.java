package RPC;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ClientRPC {
    public static void main(String[] args) {
        try{
            Registry reg = LocateRegistry.getRegistry("localhost", 1099);
            RemoteIntrfc srvc = (RemoteIntrfc) reg.lookup("RPC");
            int sum = srvc.add(5, 3);
            int prdt = srvc.mult(4, 6);
            System.out.println("La somme de 3 et 5 est" + sum);
            System.out.println("Le produit de 4 et 6 est" + prdt);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}