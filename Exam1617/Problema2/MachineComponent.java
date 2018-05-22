/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1617.Problema2;

/**
 *
 * @author jcc30
 */
public abstract class MachineComponent {
    protected long id;
    
    public MachineComponent(long id){
        this.id = id;
    }
    
    public abstract long getId();
    
    public abstract void addMePlease(MachineComposite mc);
}
