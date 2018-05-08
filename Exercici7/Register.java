/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class Register{
    private Store store;
    private Sale currentSale;
    
    public Register(Store store){
        this.store = store;
    }
    
    public void createNewSale(){
        this.currentSale = new Sale();
    }
}
