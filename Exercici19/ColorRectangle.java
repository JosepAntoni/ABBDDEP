/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;
import java.awt.Color;
/**
 *
 * @author jcc30
 */
public class ColorRectangle extends Rectangle{
    
    private final Color color;

    public ColorRectangle(float x, float y, float width, float height, Color color) {
        super(x, y, width, height);
        this.color = color;
    }
    
    public ColorRectangle(ColorRectangle cr){
        super(cr);
        this.color = cr.color;
    }
    
    @Override
    public ColorRectangle copy(){
        return new ColorRectangle(this);
    }
}
