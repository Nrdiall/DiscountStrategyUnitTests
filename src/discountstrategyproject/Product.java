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
public class Product {
    private String productId;
    private String productName;
    private double unitPrice;
    private DiscountStrategy discountStrategy;

    public Product(String productId, String productName, double unitPrice, DiscountStrategy discountStrategy) {
        setProductId(productId);
        setProductName(productName);
        setUnitPrice(unitPrice);
        setDiscountStrategy(discountStrategy);
    }
    public double getDiscount(int qty){
        return discountStrategy.getDiscountAmt(unitPrice, qty);
    }

    public final String getProductId() {
        return productId;
    }

    public final void setProductId(String productId) {
        this.productId = productId;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final double getUnitPrice() {
        return unitPrice;
    }

    public final void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public final DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public final void setDiscountStrategy(DiscountStrategy ds) {
        this.discountStrategy = ds;
    }
    
}
