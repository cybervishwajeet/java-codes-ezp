import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FibonacciInterface extends Remote {
    long calculateFibonacci(int n) throws RemoteException;
}
