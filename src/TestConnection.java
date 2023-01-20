


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author ASUS
 */
public class TestConnection {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        
        System.out.println("Connected");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sir","root","452010")) {
            System.out.println("Connected");
            String qr;
            qr = "insert into student values (15,'KATIKA',99)";
            Statement stmt = con.createStatement();
            int n=stmt.executeUpdate(qr);
            System.out.println(n+ "Recored Add");
        }
    }
   
}
