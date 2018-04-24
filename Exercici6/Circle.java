/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici6;

/**
 *
 * @author jcc30
 */
public class Circle extends Figure{
    
    private final float z;
    
    public Circle(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    
    public Circle(Circle c){
        super(c);
        this.z = c.z;
    }
    
    @Override
    public Circle copy(){
        return new Circle(this);
    }
}
