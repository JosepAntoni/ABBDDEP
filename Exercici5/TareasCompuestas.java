/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici5;
import java.util.*;
/**
 *
 * @author jcc30
 */
public abstract class TareasCompuestas implements Task {
    
    protected List<TareasCompuestas> components = new ArrayList<>();

    
    @Override
    public int costInEuros(){
        int cost = 0;
        for(TareasCompuestas tc : components){
            cost += tc.costInEuros();
        }
        return cost;
    }
    
    public void addSubTask(TareasCompuestas task){
        components.add(task);
    }
}
