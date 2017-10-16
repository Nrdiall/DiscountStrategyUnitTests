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
        setProductID(productID);
        setQty(qty); 
        setData(data);
    }

    public final int getQty() {
        return qty;
    }

    public final void setQty(int qty) {
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
        if(data == null){
            throw new IllegalArgumentException("Error with the data property");
        }else{
            this.data = data;
        }
    }
    
    
}
