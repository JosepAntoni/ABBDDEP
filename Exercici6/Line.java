/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici6;

/**
 *
 * @author jcc30
 */
public class Line extends Figure{
    
    private final float x2;
    private final float y2;
    
    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public Line(Line l){
        super(l);
        this.x2 = l.x2;
        this.y2 = l.y2;
    }
    
    @Override
    public Line copy(){
        return new Line(this);
    } 
}
