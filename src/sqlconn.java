
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.sql.*;
 public class sqlconn {
    public static Connection connect()
    {
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sarasavi","root","");
        return conn;
    }
    catch (Exception e)
    {
        return null;
    }
            
            
            
            
    }
    
}

    

