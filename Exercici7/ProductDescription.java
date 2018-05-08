/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class ProductDescription extends SLI{
    private String description;
    private int price;

    public ProductDescription(ProductDescription desc, int quantity) {
        super(desc, quantity);
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }
    
    public int getPrice(){
        return this.price;
    }
    
    public void setPrice(int price){
        this.price = price;
    }
}
