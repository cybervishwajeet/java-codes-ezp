import java.net.*;

public class Inetaddress {
    public static void main(String[] args)throws Exception{

        InetAddress i=InetAddress.getLocalHost();
        System.out.println("Hostname="+i);

        URL url = new URL("http://google.com");
        System.out.println("Hostname using URL class: " + url.getHost());

        URLConnection urlConnection = url.openConnection();
        System.out.println("Hostname using URLConnection class: " + urlConnection.getHeaderField("Host"));
    }
    
}
