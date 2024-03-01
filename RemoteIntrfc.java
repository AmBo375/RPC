package RPC;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteIntrfc extends Remote{
    int add(int a, int b) throws RemoteException;
    int mult(int a, int b) throws RemoteException;
}
