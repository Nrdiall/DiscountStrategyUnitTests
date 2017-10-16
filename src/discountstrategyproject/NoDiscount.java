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
public class NoDiscount implements DiscountStrategy {

    public NoDiscount() {
        getDiscountAmt(0,0);
    }
    @Override
    public double getDiscountAmt(double unitPrice, int qty) {
        return 0;
    }
    
}
