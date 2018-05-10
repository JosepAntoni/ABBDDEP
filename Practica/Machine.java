/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Practica;

/**
 *
 * @author jcc30
 */
public class Machine extends MachineComponent{

    /**
     * Returns a boolean which indicates if the machine is broken
     * @return boolean broken
     */
    @Override
    public boolean isBroken() {
        return broken;
    }
    
    /**
     * Checks if boolean broken is false, and if it is, sets it's value to true 
     * and notifies the observer.  
     */
    @Override
    public void setBroken(){ 
        if(!isBroken()){
            broken = true;
            setChanged();
            notifyObservers(broken);
        }
    }
    
    /**
     * Checks if boolean broken is true, and if it is, sets it's value to false 
     * and notifies the observer.  
     */
    @Override
    public void repair(){
        if(isBroken()){
            broken = false;
            setChanged();
            notifyObservers(broken);
        }
    }
    
}
