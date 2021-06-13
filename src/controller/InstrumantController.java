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
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Instrumant;

/**
 *
 * @author Chamuditha
 */






//INSERT INTO `yamaha`.`instruments` (`Instruments_Name`, `Quantity_Of_Hands`, `Unit_Price`, `CID`) VALUES ('Flute', '100', '150', '2');
public class InstrumantController {
    private  String selectAllInstrumentSQL = "SELECT * FROM yamaha.instruments";
    private String save = "INSERT INTO instruments (Instruments_Name,Quantity_Of_Hands,Unit_Price,SupID) VALUES(?,?,?,?)";
private  String search = "select * from instruments where Instruments_Name like '%@%'";
    public boolean saveInstrumant(Instrumant obj){
        try 
        {
              
            Connection conn = DBConnection.getInstance().getConnection();
            PreparedStatement stm = conn.prepareStatement(save);
            stm.setObject(1, obj.getDescription());
             stm.setObject(2, obj.getQty());
              stm.setObject(3, obj.getUnitPrice());
               stm.setObject(4, obj.getSupID());
              
            int i = stm.executeUpdate();
           return i>=0;
            
       
        }
        catch(Exception ex){return false;}
        
  
    }
 
      public ArrayList<Instrumant> GetInstruments() {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            PreparedStatement stm = conn.prepareStatement(selectAllInstrumentSQL);
             
            ResultSet rst = stm.executeQuery();
        ArrayList<Instrumant> instrumentsList = new ArrayList();
        while(rst.next()){
        
//            orders.add(new OrderItem(Integer.parseInt(rst.getObject(1)),Integer.parseInt( rst.getObject(2)), Integer.parseInt(rst.getObject(3))));   
                instrumentsList.add(new Instrumant(rst.getInt("idInstruments"),rst.getString("Instruments_Name"),rst.getInt("Quantity_Of_Hands"),rst.getInt("Unit_Price"),rst.getInt("SupID")));
        }
        return instrumentsList;
        }catch (Exception ex ){
            
            return null;
        }}
         
  
        public ArrayList<Instrumant> searchInstruments(String cr) {
        try {
            Connection conn = DBConnection.getInstance().getConnection();
            String sqlsearch=search.replace("@", cr);
            System.out.println(sqlsearch);
            
            PreparedStatement stm = conn.prepareStatement(sqlsearch);
           // stm.setObject(1, cr);
             
            ResultSet rst = stm.executeQuery();
        ArrayList<Instrumant> instrumentsList = new ArrayList();
        while(rst.next()){
        
//            orders.add(new OrderItem(Integer.parseInt(rst.getObject(1)),Integer.parseInt( rst.getObject(2)), Integer.parseInt(rst.getObject(3))));   
                instrumentsList.add(new Instrumant(rst.getInt("idInstruments"),rst.getString("Instruments_Name"),rst.getInt("Quantity_Of_Hands"),rst.getInt("Unit_Price"),rst.getInt("SupID")));
        }
        return instrumentsList;
        }catch (Exception ex ){
            
           
            System.out.println(ex.getMessage());
            return null;
        }}
         
    

}
    
  