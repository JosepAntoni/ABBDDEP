/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;


/**
 *
 * @author jcc30
 */
public class Rectangle extends Figure{
    
    private float width;
    private float height;
    
    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(Rectangle r){
        super(r);
        this.width = r.width;
        this.height = r.height;
    }
    
    @Override
    public Rectangle copy(){
        return new Rectangle(this);
    }

    /**
     * @return the width
     */
    public float getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(float width) {
        this.width = width;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public void accept(FigureVisitor visitor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
