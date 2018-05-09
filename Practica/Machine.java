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
