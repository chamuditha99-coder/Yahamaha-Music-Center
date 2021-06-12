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
import model.Accessory;

/**
 *
 * @author Chamuditha
 */
public class AccessoriesController extends JOptionPane {
    
    private String AccessoriesSQLInsert="insert into Accessories (Name,Sup_ID) Values(?,?)";
       private String SearchAccessoriesByIDSQL="SELECT * FROM Accessories WHERE [ID]=@id";
       
       
           public boolean saveAccessories(Accessory accessory ) throws ClassNotFoundException, SQLException{
        Connection conn = DBConnection.getInstance().getConnection();
        
         PreparedStatement stm = conn.prepareStatement(AccessoriesSQLInsert);
      
           stm.setObject(1, accessory.getName());
          stm.setObject(2, accessory.getSup_ID());
                  
          int res = stm.executeUpdate();
        if (res>0) {
           
           return true;
        }else{
            return false;
        }
           
           
           
           }
           
}
