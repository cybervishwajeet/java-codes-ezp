import java.io.*;
import java.net.*;

public class myServer {
    public static void main(String[] args) throws Exception {
        ServerSocket s = new ServerSocket(8888);
        System.out.println("Server started........");

        Socket s2 = s.accept();
        System.out.println("Client connected....:" + s2);

        BufferedReader reader = new BufferedReader(new InputStreamReader(s2.getInputStream()));
        PrintWriter writer = new PrintWriter(s2.getOutputStream(), true);

        String msg = reader.readLine();
        System.out.println("Data received from client is...." + msg);

        writer.println("hello client...." + msg);

        reader.close();
        writer.close();
        s.close();
    }
}
