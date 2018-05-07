/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class Sale {
    private List<SLI> lines = new ArrayList<>();
    public void createSalesLineItem(ProductDescription desc, int quantity){
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
    }
}
