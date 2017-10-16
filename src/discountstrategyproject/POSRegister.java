/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;
/**
 *
 * @author Naython
 */
public class POSRegister {
    private ReceiptGenerator rg;

    public POSRegister(ReceiptGenerator rg) {
        this.rg = rg;
    }
    public void addToOrder(String productId, int qty){
        if(productId.length() == 0||qty<1){
            throw new IllegalArgumentException("Error with adding to the order at POS");
        }else{
            rg.addLineItem(productId, qty);
        }
    } 
    void endOrder() {
        rg.getReceipt();
    }
    public ReceiptGenerator getRg() {
        return rg;
    }

    public void setRg(ReceiptGenerator rg) {
        this.rg = rg;
    }

   
    
   
}
