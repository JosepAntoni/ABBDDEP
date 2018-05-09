package Practica;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */


import java.util.*;
import javax.swing.*;
/**
 *
 * @author jcc30
 */
public class Observer implements java.util.Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("L'objecte " + o.getClass().getSimpleName() + 
                " ha canviat el seu estat a " + arg);
    }
    
}
