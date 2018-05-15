/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;

/**
 *
 * @author jcc30
 */
public class Scaler implements FigureVisitor{

    private final float scaler;
    
    public Scaler(float scaler){
        this.scaler = scaler;
    }
    
    @Override
    public void visit(Circle c) {
        c.setZ(getScaler() * c.getZ());
    }

    @Override
    public void visit(ColorRectangle r) {
        r.setHeight(getScaler() * r.getHeight());
        r.setWidth(getScaler() * r.getWidth());
    }

    @Override
    public void visit(Line l) {
        l.setX2(l.getX() + getScaler() * (l.getX2()-l.getX()));
        l.setY2(l.getY() + getScaler() * (l.getY2()-l.getY()));
    }

    @Override
    public void visit(Drawing d) {
        for (Figure f : d.getList()){
            f.accept(this);
        }
    }

    /**
     * @return the scaler
     */
    public float getScaler() {
        return scaler;
    }
    
}
