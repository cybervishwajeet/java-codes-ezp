import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPResolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get hostname from the user
        System.out.print("Enter the hostname: ");
        String hostname = scanner.nextLine();

        try {
            // Get the InetAddress object for the given hostname
            InetAddress address = InetAddress.getByName(hostname);

            // Get and print the IP address
            String ipAddress = address.getHostAddress();
            System.out.println("IP Address for " + hostname + ": " + ipAddress);
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + hostname);
        } finally {
            scanner.close();
        }
    }
}
