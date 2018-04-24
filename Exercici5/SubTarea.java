/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici5;

/**
 *
 * @author jcc30
 */
public class SubTarea implements Task{
    
    private final int /*Money*/ cost;
    private final int days;
    
    public SubTarea (int cost, int days){
        this.cost = cost;
        this.days = days;
    }
    
    @Override
    public int /*Money*/ costInEuros(){
        return this.cost;
    }
    
    @Override
    public int costInDays(){
        return this.days;
    }
}
