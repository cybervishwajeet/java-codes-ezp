package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {


    

    private static final String URL_name="jdbc:mysql://localhost:3306/test";
    private static final String Uname="root";

    private static final String upass="root";

    public static void main(String[] args) {




        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL_name,Uname,upass);
            Statement smt = con.createStatement();
         smt.executeQuery("CREATE TABLE myTABLE("
         +"Name VARCHAR(10),"
         +"age INT)");
            System.out.println("Table created successfully...");
       
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
