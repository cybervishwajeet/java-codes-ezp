package JDBC;
import java.sql.*;

class insertvalues {
public static void main(String[] args) {
// TODO Auto-generated method stub
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?)");
 psmt.setInt(1,4);
 psmt.setString(2,"shivani");
 psmt.setString(3,"18");

int i=psmt.executeUpdate();
System.out.println(i+"record is inserted....");

con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}