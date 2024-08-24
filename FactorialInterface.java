import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FactorialInterface extends Remote {
    long calculateFibonacci(int n) throws RemoteException;
}
