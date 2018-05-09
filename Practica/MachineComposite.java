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

    public void addComponent(MachineComponent component){
        components.add(component);
        if (component.isBroken()) { setBroken(); }
    }

    @Override
    public boolean isBroken() {
        updateBrokenComponents();
        return broken;
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
            for (MachineComponent mc : brokenComponents) {
                mc.repair();
            }
            broken = false;
            repairBrokenComponents();
            setChanged();
            notifyObservers(broken);
        }
    }

    private void repairBrokenComponents(){
        brokenComponents.removeAll(components);
    }
    
    private void updateBrokenComponents() {
        for (MachineComponent mc : components) {
            if (mc.isBroken() && !brokenComponents.contains(mc)){
                brokenComponents.add(mc);
                setBroken();
            }
        }
    }
}
