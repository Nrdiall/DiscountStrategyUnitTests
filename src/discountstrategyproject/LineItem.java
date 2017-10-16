/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;
/**
 *
 * @author L117student
 */
public class LineItem {
    private String productID;
    private int qty;
    private ReceiptDataAccessStrategy data;

    public LineItem(String productID, int qty,ReceiptDataAccessStrategy data) {
        this.productID = productID;
        this.data = data; 
        this.qty = qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final ReceiptDataAccessStrategy getData() {
        return data;
    }

    public final void setData(ReceiptDataAccessStrategy data) {
        this.data = data;
    }
    
    
}
