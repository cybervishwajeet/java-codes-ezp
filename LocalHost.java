import java.net.*;
import java.io.*;

public class LocalHost{
	public static void main(String args[]) throws Exception{
		String host="LocalHost";
		for(int i=1;i<=1024;i++)
		{
			Socket s=new Socket(host,i);
			System.out.println("Port Number: "+i+" of "+host);
		}
	}

}