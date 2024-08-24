package JDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
class JDBC_update {
public static void main(String[] args) {
// TODO Auto-generated method stub
String value;

int eid;
double ename;
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
Statement smt=con.createStatement();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter emp id");
value=br.readLine();
eid=Integer.parseInt(value);
System.out.println("Enter emp name");
value=br.readLine();
ename=Double.parseDouble(value);
int count=smt.executeUpdate("update emp set esal="+ename+"where eno="+eid);
if(count>0)
{
System.out.println(count+" rows updated");
}
else
{
System.out.println("NO record found");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}