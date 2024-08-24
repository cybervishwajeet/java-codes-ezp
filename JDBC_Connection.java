package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
public class JDBC_Connection {
public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connectioncon=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
Statement smt=con.createStatement();
smt.executeUpdate("create table emp1(eno int,ename varchar(20),esal int)");
System.out.println("Table Created successfully...");
con.close(); }
catch(Exception e)
{
System.out.println(e);
}
}
}