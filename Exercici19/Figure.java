/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;


/**
 *
 * @author jcc30
 */
public abstract class Figure implements ItemElement{
    
    private final float x;
    private final float y;
    
    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public Figure(Figure f){
        this.x = f.x;
        this.y = f.y;
    }
    
    public abstract Figure copy();

    /**
     * @return the x
     */
    public float getX() {
        return x;
    }

    /**
     * @return the y
     */
    public float getY() {
        return y;
    }
    
}
