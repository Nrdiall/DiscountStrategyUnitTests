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
public class PercentOffDiscount implements DiscountStrategy {   
    private double percentOffPercent;
    
    public PercentOffDiscount(double percentOffPercent) {
        setPercentOffPercent(percentOffPercent);
    }

    @Override
    public final double getDiscountAmt(double unitPrice, int qty) {
        return percentOffPercent * unitPrice * qty; 
    }
    
    public final double getPercentOffPercent() {
        return percentOffPercent;
    }

    public final void setPercentOffPercent(double percentOffPercent) {
        this.percentOffPercent = percentOffPercent;
    }
}
