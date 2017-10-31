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
        if(unitPrice <=0 || qty<=0){
            throw new IllegalArgumentException("Invalid entry for the getDiscountAmt method.");
        }
        return percentOffPercent * unitPrice * qty; 
    }
    
    public final double getPercentOffPercent() {
        return percentOffPercent;
    }

    public final void setPercentOffPercent(double percentOffPercent) {
        if(percentOffPercent > 1.0 || percentOffPercent <= 0.0){
            throw new IllegalArgumentException("Please enter a percentage greater than 0 and less than 1.");
        }
        this.percentOffPercent = percentOffPercent;
    }
}
