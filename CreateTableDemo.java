//Database Connection.
import java.sql.*;
class CreateTableDemo
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver Loaded Successfully!!!");
Connection
con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
System.out.println("Connection Established Successfully!!!");
}catch(Exception e)
{
System.out.println(e);
}
}
}