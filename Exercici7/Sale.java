/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class Sale extends Observable{
    private List<SLI> lines = new ArrayList<>();
    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        setChanged();
        notifyObservers();
    }
    
    public List<SLI> getList(){
        return this.lines;
    }
}
