package db;


import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chamuditha
 */
public class DBConnection {
    
    
    private static DBConnection dBConnection;
    private Connection connection;

    public DBConnection() throws ClassNotFoundException, SQLException {
      
            Class.forName("com.mysql.cj.jdbc.Driver");         
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/yamaha","root","1234");
            
        }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        
   if(dBConnection==null){
        dBConnection = new DBConnection();
   }
   return dBConnection;
    
    }
    
    public Connection getConnection(){
    return connection;
    }
        }
    
    
    
