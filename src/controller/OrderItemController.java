/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.OrderItem;

/**
 *
 * @author Chamuditha
 */
public class OrderItemController {
    
    private String sql = "INSERT INTO cus_instrument_order(`CustomerID`, `InstrumentID`, `OrderQty`) VALUES(?,?,?)";
    //INSERT INTO `yamaha`.`cus_instrument_order` (`CustomerID`, `InstrumentID`, `OrderQty`) VALUES ('1', '1', '1');

    
    public boolean placeOrderInstrumant(OrderItem item) throws ClassNotFoundException, SQLException{
    
        
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, item.getCustomerId());
        stm.setObject(2, item.getInsID());
        stm.setObject(3, item.getOrderQty());
        int res = stm.executeUpdate();
        if(res>0){
            return true;
      
        }else{
        return false;
        }

    }
    
//    select * from cus_instrument_order order by _createdOn desc;
//select * from cus_instrument_order 
//WHERE DATE( _CREATEDON) ='2021-06-09'
//order by _createdOn desc ;
    public ArrayList<OrderItem> getOrderReport() throws ClassNotFoundException, SQLException{
    
//        String sql = "select * from cus_instrument_order " +
//"WHERE DATE( _CREATEDON) =? " +
//"order by _createdOn desc ";

String sql = " select * from cus_instrument_order order by _createdOn desc;";
        
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        ResultSet rst = stm.executeQuery();
        ArrayList<OrderItem> orders = new ArrayList();
        while(rst.next()){
        
//            orders.add(new OrderItem(Integer.parseInt(rst.getObject(1)),Integer.parseInt( rst.getObject(2)), Integer.parseInt(rst.getObject(3))));   
                orders.add(new OrderItem(rst.getInt("OrderId"),rst.getInt("CustomerId"),rst.getInt("InstrumentID"),rst.getInt("OrderQty")));
        }
        return orders;
    }
    
}
