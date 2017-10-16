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
        setRg(rg);
    }
    public final void addToOrder(String productId, int qty){
        if(productId.length() == 0||qty<1){
            throw new IllegalArgumentException("Error with adding to the order at POS");
        }else{
            rg.addLineItem(productId, qty);
        }
    } 
    public final void endOrder() {
        rg.getReceipt();
    }
    public final ReceiptGenerator getRg() {
        return rg;
    }

    public final void setRg(ReceiptGenerator rg) {
        if(rg == null){
            throw new IllegalArgumentException("Error with the ReceiptGenerator in POSRegister");
        }else{
            this.rg = rg;
        }
    }

   
    
   
}
