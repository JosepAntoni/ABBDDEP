package Practica;

/*
 * This project has been developed by Josep Antoni Costa Camps
 */


import java.util.*;

/**
 *
 * @author jcc30
 */
public class MachineComposite extends MachineComponent{
    private final List<MachineComponent> components = new ArrayList<>();
    private final List<MachineComponent> brokenComponents = new ArrayList<>();

    /**
    *Add a MachineComponent to the list components, and if this MachineComponent
    *is broken calls the function setBroken.
    *@param component a MachineComponent
    */
    public void addComponent(MachineComponent component){
        components.add(component);
        if (component.isBroken()) { setBroken(); }
    }

    /**
     * Calls the function updateBrokenComponents and returns a boolean 
     * which indicates if the machine is broken.
     * @return boolean broken
     */
    @Override
    public boolean isBroken() {
        updateBrokenComponents();
        return broken;
    }
    
    /**
     * Checks if boolean broken is false, and if it is, sets it's value to true 
     * and notifies the observer.
     */
    @Override
    public void setBroken() {
        if (!isBroken()){
            broken = true;
            setChanged();
            notifyObservers(broken);
        }
    }

    /**
     * Checks if boolean broken is true, and if it is, repairs all the 
     * MachineComponents in the list brokenComponents, set's the value
     * of boolean broken to false and notifies the observer.
     */
    @Override
    public void repair() {
        if (isBroken()) {
            for (MachineComponent mc : brokenComponents) {
                mc.repair();
            }
            broken = false;
            repairBrokenComponents();
            setChanged();
            notifyObservers(broken);
        }
    }

    /**
     * Removes all the components in the list brokenComponents.
     */
    private void repairBrokenComponents(){
        brokenComponents.removeAll(components);
    }
    
    /**
     * Checks if there are broken components in the list components.
     */
    private void updateBrokenComponents() {
        for (MachineComponent mc : components) {
            if (mc.isBroken() && !brokenComponents.contains(mc)){
                brokenComponents.add(mc);
                setBroken();
            }
        }
    }
}
