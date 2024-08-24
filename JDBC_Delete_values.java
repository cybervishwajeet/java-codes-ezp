package JDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.Statement;
class JDBC_delete_values {
public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
Statement smt=con.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
System.out.println("Enter deletion emp id");
int eno=Integer.parseInt(br.readLine());
int count=smt.executeUpdate("delete from emp where eno="+eno);
if(count==1)
{
System.out.println(count+" record deleted");
}
else
{
System.out.println("NO record deleted");
}
System.out.println("Do you want to delete more records?");
String ch=br.readLine();
if(ch.equalsIgnoreCase("no"))
break;
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}