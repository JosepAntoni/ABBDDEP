/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
class ProductDescription extends Observable{
    private String description;
    private int price;
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
        setChanged();
        notifyObservers(description);
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(int price){
        this.price = price;
        setChanged();
        notifyObservers(price);
    }
}
