import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Vector; 

public class FibonacciClient {

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry();
            FibonacciInterface stub = (FibonacciInterface) registry.lookup("FibonacciServer");

           int n = 10; // Replace with the desired Fibonacci series length
            for (int i = 0; i < n; i++) {
                System.out.print(stub.calculateFibonacci(i)+ " ");
            }
        } catch (Exception e) {
            System.err.println("FibonacciClient exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
