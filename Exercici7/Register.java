/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class Register extends Observable{
    private Store store;
    private Sale currentSale;
    
    public Register(Store store){
        this.store = store;
    }
    
    public void createNewSale(){
        this.currentSale = new Sale();
    }
    
    public Store getStore(){
        return this.store;
    }
    
    public Sale getCurrentSale(){
        return this.currentSale;
    }
    
    public void setSale(Sale sale){
        this.currentSale = sale;
    }
}
