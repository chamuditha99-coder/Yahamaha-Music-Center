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
public class Accessory {
    private int Accessories_ID;
    private String Name;
    private int C_ID;
    private int Sup_ID;
    
    public Accessory(){
}
public Accessory(int Accessories_ID,String Name,int C_ID,int Sup_ID){

this.Accessories_ID= Accessories_ID;
this.Name= Name;
this.C_ID= C_ID;
this.Sup_ID= Sup_ID;

}
public Accessory(String Name,int Sup_ID){

this.Name= Name;
this.Sup_ID= Sup_ID;
}
    public int getAccessories_ID() {
        return Accessories_ID;
    }

    public void setAccessories_ID(int Accessories_ID) {
        this.Accessories_ID = Accessories_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getC_ID() {
        return C_ID;
    }

    public void setC_ID(int C_ID) {
        this.C_ID = C_ID;
    }

    public int getSup_ID() {
        return Sup_ID;
    }

    public void setSup_ID(int Sup_ID) {
        this.Sup_ID = Sup_ID;
    }

}
