package Practica;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */


import java.util.*;

/**
 *
 * @author jcc30
 */
public abstract class MachineComponent extends Observable{
    protected boolean broken = false;
    
    
    public void setBroken(){ 
        broken = true;
        setChanged();
        notifyObservers(broken);
    }
    
    public void repair(){ 
        broken = false;
        setChanged();
        notifyObservers(broken);
    }
    
    public abstract boolean isBroken();
}
