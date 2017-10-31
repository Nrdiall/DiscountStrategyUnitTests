/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author L115student
 */
public class PercentOffDiscountTest {
    public PercentOffDiscountTest() {
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDiscountAmt method, of class PercentOffDiscount.
     */
    @Test(expected = IllegalArgumentException.class)
    public void getDiscountAmtShouldHaveUnitPriceGreaterThenZero() {
        DiscountStrategy discount = new PercentOffDiscount(.5);
        discount.getDiscountAmt(0, 3);
    }
    
    @Test
    public void getDiscountAmtShouldAcceptValidInputs() {
        DiscountStrategy discount = new PercentOffDiscount(.5);
        discount.getDiscountAmt(22.3, 3);
    }
    
}
