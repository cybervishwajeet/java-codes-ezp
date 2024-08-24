import java.io.*;
import java.net.*;

public class myClient {
    public static void main(String[] args) throws Exception {

        Socket client = new Socket("localhost", 8888);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(client.getOutputStream(), true);
        BufferedReader server = new BufferedReader(new InputStreamReader(client.getInputStream()));

        System.out.println("Enter message to send.....");
        writer.println(reader.readLine());

        System.out.println("Received from server: " + server.readLine());
        client.close();
    }
}
