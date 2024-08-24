import java.net.*;
public class URL_Operation
{
public static void main(String args[])
{
try
{
InetAddress Lhost= InetAddress.getLocalHost();
String hostname = Lhost.getHostName();
System.out.println("Hostname using InetAddress:"+hostname);
URL u=new URL("https://www.google.com");
//String host = u.getHost();
System.out.println("Hostname using URL class:"+u.getHost());
System.out.println("Protocol:"+u.getProtocol());
System.out.println("Host:"+u.getHost());
System.out.println("Port:"+u.getPort());
System.out.println("Path:"+u.getPath());
System.out.println("Query:"+u.getQuery());
System.out.println("Ref:"+u.getRef());
URLConnection c=u.openConnection();
c.connect();
String cHostname = c.getURL().getHost();
System.out.println("Hostname using URLConnection: "+cHostname);
}
catch(UnknownHostException | MalformedURLException e)
{
e.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}