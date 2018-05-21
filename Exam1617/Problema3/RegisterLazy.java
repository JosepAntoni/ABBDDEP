/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1617.Problema3;

/**
 *
 * @author jcc30
 */
public class RegisterLazy extends MachineComponent{
    
    private static RegisterLazy instance;
    private static final Object classLock = RegisterLazy.class;
    
    public void addComponent(String name, MachineComponent mc){
        
    }
    
    public String getComponent(String name){
        return name;
    } 
    
    private RegisterLazy(){}
    
    public RegisterLazy getInstance(){
        synchronized(classLock){
            if (instance == null){
                instance = new RegisterLazy();
            }
            return instance;
        }
    }
}
