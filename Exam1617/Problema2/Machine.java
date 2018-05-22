/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1617.Problema2;

/**
 *
 * @author jcc30
 */
public class Machine extends MachineComponent{

    public Machine(long id) {
        super(id);
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void addMePlease(MachineComposite mc) {
        mc.add(mc);
    }
    
}
