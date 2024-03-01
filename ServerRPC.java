package RPC;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class ServerRPC extends RemoteException implements RemoteIntrfc {
    protected ServerRPC() throws RemoteException {
        super();
    }
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
    @Override
    public int mult(int a, int b) throws RemoteException {
        return a * b;
    }

    public static void main(String[] args) {
        try {
            RemoteIntrfc rmtInt = new ServerRPC();
            Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("RPC", rmtInt);
            System.out.println("Le serveur RPC est prét");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
