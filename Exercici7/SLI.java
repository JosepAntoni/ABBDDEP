/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;

/**
 *
 * @author jcc30
 */
public class SLI extends Sale{
    private ProductDescription desc;
    private int quantity;
    public SLI(ProductDescription desc, int quantity){
        this.desc = desc;
        this.quantity = quantity;
    }
    
    public int subTotal(){
        return desc.getPrice() * quantity;
    }
}
