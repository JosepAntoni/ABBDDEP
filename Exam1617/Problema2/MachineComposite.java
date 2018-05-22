/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1617.Problema2;

import java.util.*;

/**
 *
 * @author jcc30
 */
public class MachineComposite extends MachineComponent implements Observer{
    
    private List<MachineComponent> components = new ArrayList<>();
    private Observable obs = new Observable();

    public MachineComposite(long id){
        super(id);
    }
    
    public void addComponent(MachineComposite mc){
        mc.addMePlease(mc);
    }
    
    public void add(MachineComponent mc){
        components.add(mc);
        //obs.setChanged(); /*A l'examen era un mètode públic*/
        obs.notifyObservers(mc);
    }
    
    public void addObserver(Observer o){
        obs.addObserver(o);
    }
    
    @Override
    public long getId() {
        return id;
    }

    @Override
    public void update(Observable o, Object arg) {
        //obs.setChanged(); /*A l'examen era un mètode públic*/
        obs.notifyObservers(this);
    }

    @Override
    public void addMePlease(MachineComposite mc) {
        mc.add(this);
        this.addObserver(mc);
    }
}
