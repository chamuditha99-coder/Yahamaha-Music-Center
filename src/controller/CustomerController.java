/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author Chamuditha
 */
public class CustomerController extends JOptionPane{
    //Private props/
    private String CustomerSQLInsert="insert into Customer Values(?,?,?,?)";
   private String SearchCustomerByIDSQL="SELECT * FROM CUSTOMER WHERE [ID]=@id";
    
    
    /////
    public boolean saveCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        Connection conn = DBConnection.getInstance().getConnection();
        
        PreparedStatement stm = conn.prepareStatement(CustomerSQLInsert);
        
        stm.setObject(1, customer.getCustomerId());
         stm.setObject(2, customer.getCustomerName());
          stm.setObject(3, customer.getAdress());
           stm.setObject(4, customer.getTelNo());
        int res = stm.executeUpdate();
        conn.close();
        if (res>0) {
           
           return true;
        }else{
            return false;
        }
    }
    
    public Customer searchCustomer(String id){
        
      String query=  SearchCustomerByIDSQL.replaceFirst("@id",id);
        return null;
    }
    
    
}
