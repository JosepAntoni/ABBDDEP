/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;


/**
 *
 * @author jcc30
 */
public class Circle extends Figure implements ItemElement{
    
    private float z;
    
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

    /**
     * @return the z
     */
    public float getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
