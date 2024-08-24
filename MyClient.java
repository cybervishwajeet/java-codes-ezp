import java.rmi.*;

public class MyClient{

public static void main(String args[]){
try{

Adder stub=(Adder)Naming.lookup("RMI.//LocalHost:5000/gpp");
System.out.println(stub.add(34,4));

}catch(Exception e){System.out.println(e);}
}

}
