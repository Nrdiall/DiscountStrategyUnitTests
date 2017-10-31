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
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        POSRegister pos = new POSRegister( new PaperReceipt("100", new InMemoryDataAccess()));
        pos.addToOrder("A101",5);
        pos.addToOrder("B205", 7);
        pos.endOrder();
    }
    
}
