/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici7;
import java.util.*;
import java.io.*;
/**
 *
 * @author jcc30
 */
public class Observador implements Observer{
    
    @Override
    public void update(Observable o, Object arg) {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(""
                    + "/home/jcc30/NetBeansProjects/"
                    + "Exercicis/src/Exercici7/archivo.log", true);
            pw = new PrintWriter(fichero);

            pw.println("El valor del objecte " + o + " ha canviat a " + arg);

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
    }
    
}