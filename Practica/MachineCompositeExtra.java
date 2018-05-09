/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Practica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jcc30
 */
public class MachineCompositeExtra extends MachineComponent{
    private final List<MachineComponent> components = new ArrayList<>();

    public void addComponent(MachineComponent component){
        components.add(component);
    }
    
    @Override
    public boolean isBroken() {
        if (broken) { return true; }
        for (MachineComponent mc : components) {
            if (mc.isBroken()){ setBroken(); return true; }
        }
        return false;
    }
    
    @Override
    public void setBroken() {
        if (!isBroken()){
            broken = true;
            setChanged();
            notifyObservers(broken);
        }
    }

    @Override
    public void repair() {
        if (isBroken()) {
            for (MachineComponent mc : components) {
                mc.repair();
            }
            broken = true;
            setChanged();
            notifyObservers(broken);
        }
    }
}
