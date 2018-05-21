/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exam1617.Problema3;

/**
 *
 * @author jcc30
 */
public class RegisterEager extends MachineComponent{
    
    public static final RegisterEager instancia = new RegisterEager();
    
    private RegisterEager(){}
    
    public void addComponent(String name, MachineComponent mc){
        
    }
    
    public String getComponent(String name){
        return name;
    } 
}
