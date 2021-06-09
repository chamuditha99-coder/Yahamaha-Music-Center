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
public class Customer {    
    private String customerId;
    private String customerName;
    private String adress;
    private int telNo;

    public Customer() {
    }

    public Customer(String customerId, String customerName, String adress, int telNo) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.adress = adress;
        this.telNo = telNo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getTelNo() {
        return telNo;
    }

    public void setTelNo(int telNo) {
        this.telNo = telNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerId=" + customerId + ", customerName=" + customerName + ", adress=" + adress + ", telNo=" + telNo + '}';
    }
    
    
}
