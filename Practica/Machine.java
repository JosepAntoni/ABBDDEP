/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Practica;

/**
 *
 * @author jcc30
 */
public class Machine extends MachineComponent{

    @Override
    public boolean isBroken() {
        return broken;
    }
    
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
    
}
