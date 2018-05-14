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
    
    public Scaler(int scaler){
        this.scaler = scaler;
    }
    
    @Override
    public void visit(Circle c) {
        c.setZ(getScaler() * c.getZ());
    }

    @Override
    public void visit(Rectangle r) {
        r.setHeight(getScaler() * r.getWidth());
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
            if (f instanceof Circle){
                visit((Circle)f);
            }else if (f instanceof Rectangle){
                visit((Rectangle)f);
            }else if (f instanceof Line){
                visit((Line)f);
           }
        }
    }

    /**
     * @return the scaler
     */
    public float getScaler() {
        return scaler;
    }
    
}
