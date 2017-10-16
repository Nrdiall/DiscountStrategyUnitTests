/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.time.LocalDateTime;


/**
 *
 * @author Naython
 */
public class PaperReceipt implements ReceiptGenerator {
    private LineItem[] lineItems;
    private String custId;
    private ReceiptDataAccessStrategy db;

    
    public PaperReceipt(String custId, ReceiptDataAccessStrategy db) {
        lineItems = new LineItem[0];
        setCustId(custId);
        setDb(db);
    }
    @Override
    public void getReceipt() {
        System.out.println("Thank You for Shopping!!!");
        System.out.println(LocalDateTime.now());
        Customer customer = db.findCustomer(custId);
        if(customer == null){
            System.out.println("");
        }else{
            System.out.println(customer.getCustName());
        }
        System.out.println("");
        System.out.println("ID     Item                    Price       Qty       Discount");
        System.out.println("--     ----                    -----       ---       --------");
        Product product = null;
        double total = 0;
        double discount = 0;
        double totalDiscount = 0;
        for (int i = 0; i < lineItems.length; i++){
            product = db.findProduct(lineItems[i].getProductID());
            System.out.println(product.getProductId()+ "   "+ 
                    product.getProductName()+ "       " + product.getUnitPrice()
                    +"       "+lineItems[i].getQty()+"          " +product.getDiscount(lineItems[i].getQty()));
            discount = product.getDiscount(lineItems[i].getQty());
            total+=product.getUnitPrice()*lineItems[i].getQty();
            totalDiscount+=discount;
            
        }
        System.out.println("Sub Total: $" + total);
        System.out.println("Total Saved: $"+ totalDiscount);
        System.out.println("Order Total: $"+ (total-totalDiscount));
    }
    @Override
    public final void addLineItem(String prodId, int qty){
        LineItem item = new LineItem(prodId,qty,db);
        addToArray(item);
    }
    private void addToArray(LineItem item){
        LineItem[] tempItems = new LineItem[lineItems.length+1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }

    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        this.custId = custId;
    }

    public final ReceiptDataAccessStrategy getDb() {
        return db;
    }

    public final void setDb(ReceiptDataAccessStrategy db) {
        this.db = db;
    }
}

