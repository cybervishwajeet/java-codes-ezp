
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

        // smt.executeUpdate("CREATE TABLE myTABLE("+"Name VARCHAR(10),"+"age INT)");
            System.out.println("Table created successfully...");

            PreparedStatement pst=con.prepareStatement("INSERT into myTABLE values(?,?)");

            pst.setString(1, "vishwa");
            pst.setInt(2,20);

            int r=pst.executeUpdate();

            System.out.println(r+" rows affected");


            ResultSet rs=pst.executeQuery("SELECT * From myTABLE");

            while(rs.next()){

                String name=rs.getString(1);
                int age=rs.getInt(2);
                System.out.println("Name: "+name +"AGE: "+age);

            }
       
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
