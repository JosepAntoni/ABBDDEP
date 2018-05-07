/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;

/**
 *
 * @author jcc30
 */
public class ValueControlPush {
    public static void main(String args[]){
        Observador observador = new Observador();
        ProductDescription desc = new ProductDescription();
        Store store = new Store();
        Register register = new Register(store);
        Sale sale = new Sale();
        
        desc.addObserver(observador);
        register.addObserver(observador);
        sale.addObserver(observador);
        
        desc.setDescription("Patata");
        desc.setPrice(50);
    }
}
