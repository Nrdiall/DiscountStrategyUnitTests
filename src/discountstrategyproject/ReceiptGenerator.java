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
public interface ReceiptGenerator {
   public abstract void getReceipt();
   public abstract void addLineItem(String prodId, int qty);
}

