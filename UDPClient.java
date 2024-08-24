import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        final String SERVER_IP = "localhost";
        final int SERVER_PORT = 9876;

        try (DatagramSocket clientSocket = new DatagramSocket()) {
            String message = "Client456";
            byte[] sendData = message.getBytes();
            InetAddress serverAddress = InetAddress.getByName(SERVER_IP);
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);

            clientSocket.send(sendPacket);
            System.out.println("Sent to server: " + message);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            System.out.println("Received from server: " + new String(receivePacket.getData(), 0, receivePacket.getLength()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
