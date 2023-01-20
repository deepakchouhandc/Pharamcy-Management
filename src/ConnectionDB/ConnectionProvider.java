/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionDB;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ASUS
 */
public class ConnectionProvider {
   
    static Connection con = null;
    public static Connection getCon() {
        
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma","root","452010");
            System.out.println("connection");
           return con;
        }
        catch(Exception e)
        {
            return null;
            
        }
    }
    
}
