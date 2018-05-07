/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class ValueControlPull {
    public static void main(String args[]){
        ProductDescription desc = new ProductDescription();
        Store store = new Store();
        Register register = new Register(store);
        Sale sale = new Sale();
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        
        try
        {
            fichero = new FileWriter(""
                    + "/home/jcc30/NetBeansProjects/"
                    + "Exercicis/src/Exercici7/archivoPull.log", true);
            pw = new PrintWriter(fichero);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        while(true){
            if (desc.hasChanged()){
                pw.println("Un producte  ha canviat a descripció "
                        + desc.getDescription() + " i preu " + desc.getPrice());
            }
            if (register.hasChanged()){
                pw.println("Register modificat: Store " + register.getStore() +
                         " currentSale: " + register.getCurrentSale());
            }
            if (sale.hasChanged()){
                pw.println("Sale modificat: lines " + sale.getList());
            }
        }
        
    }            
    
}
