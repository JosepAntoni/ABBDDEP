/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;


/**
 *
 * @author jcc30
 */
public class Line extends Figure{
    
    private float x2;
    private float y2;
    
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

    /**
     * @return the x2
     */
    public float getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(float x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public float getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(float y2) {
        this.y2 = y2;
    }
}
