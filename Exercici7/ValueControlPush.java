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
        Sale sale = new Sale();
        
        sale.addObserver(observador);
    }
}
