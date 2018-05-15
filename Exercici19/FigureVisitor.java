/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;

/**
 *
 * @author jcc30
 */
public interface FigureVisitor {
    public void visit(Circle c);
    public void visit(ColorRectangle r);
    public void visit(Line l);
    public void visit(Drawing d);
}
