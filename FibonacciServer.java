import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciServer implements FibonacciInterface {

    public long calculateFibonacci(int n) throws RemoteException {
        if (n <= 1) {
            return n;
        } else {
            return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        try {
            FibonacciServer server = new FibonacciServer();
            FibonacciInterface stub = (FibonacciInterface) UnicastRemoteObject.exportObject(server, 0);

            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("FibonacciServer", stub);

            System.out.println("FibonacciServer ready");
        } catch (Exception e) {
            System.err.println("FibonacciServer exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
