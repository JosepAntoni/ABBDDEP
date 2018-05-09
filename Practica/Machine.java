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
     * Indicates if the machine is broken
     * @return boolean broken
     */
    @Override
    public boolean isBroken() {
        return broken;
    }
    
    /**
     * Checks if broken is false, and if it is, sets it's value to true 
     * and notify the observer
     * 
     */
    @Override
    public void setBroken(){ 
        if(!isBroken()){
            broken = true;
            setChanged();
            notifyObservers(broken);
        }
    }
    
    @Override
    public void repair(){
        if(isBroken()){
            broken = false;
            setChanged();
            notifyObservers(broken);
        }
    }
    
}
