/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Chamuditha
 */
//(`Instruments_Name`, `Quantity_Of_Hands`, `Unit_Price`, `CID//

//INSERT INTO `yamaha`.`cus_instrument_order` (`CustomerID`, `InstrumentID`, `OrderQty`) VALUES ('1', '1', '1');
public class OrderItem {
    private int orderId;
    private int CustomerId;
    private int  insID;
    private int orderQty;

    public OrderItem() {
    }

    public OrderItem( int CustomerId, int insID, int orderQty) {
      
        this.CustomerId = CustomerId;
        this.insID = insID;
        this.orderQty = orderQty;
    }
    
        public OrderItem(int orderId, int CustomerId, int insID, int orderQty) {
      
        this.orderId = orderId;
        this.CustomerId = CustomerId;
        this.insID = insID;
        this.orderQty = orderQty;
    }

//    public OrderItem(String Cid, String Ins, String qty) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getInsID() {
        return insID;
    }

    public void setInsID(int insID) {
        this.insID = insID;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderId=" + orderId + ", CustomerId=" + CustomerId + ", insID=" + insID + ", orderQty=" + orderQty + '}';
    }
    
    
    
    
    
}
