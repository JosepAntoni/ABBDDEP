/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Practica;

/**
 *
 * @author jcc30
 */
public class ValueControl {
    public static void main(String args[]){
        Observer observador = new Observer();
        MachineComposite mc = new MachineComposite();
        Machine m = new Machine();
        m.setBroken();
        mc.addComponent(m);
        
        Machine m2 = new Machine();
        m2.setBroken();
        mc.addComponent(m2);
        
        Machine m3 = new Machine();
        mc.addComponent(m);
        
        mc.addObserver(observador);
        
        System.out.println(mc.isBroken());
        System.out.println(m.isBroken());
        mc.repair();
        System.out.println(mc.isBroken());
    }
}
