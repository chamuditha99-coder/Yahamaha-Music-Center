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
public class Instrumant {    
 
    private int ID; 
    private String instrumantCode;
    private String description;
    private int qty;
    private double unitPrice;
    private int SupID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSupID() {
        return SupID;
    }

    public void setSupID(int SupID) {
        this.SupID = SupID;
    }

    public Instrumant() {
        }
    
    public Instrumant(int ID,String insName, int qty,int unitPrice,int SupID){
        this.ID=ID;
        this.description= insName;
        this.qty=qty;
        this.unitPrice=unitPrice;
        this.SupID=SupID;
        
    }
    
    
    public Instrumant(String instrumantCode, String description, int qty, double unitPrice) {
        this.instrumantCode = instrumantCode;
        this.description = description;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getInstrumantCode() {
        return instrumantCode;
    }

    public void setInstrumantCode(String instrumantCode) {
        this.instrumantCode = instrumantCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Instrumant{" + "instrumantCode=" + instrumantCode + ", description=" + description + ", qty=" + qty + ", unitPrice=" + unitPrice + '}';
    }
    
    
    
    
}
