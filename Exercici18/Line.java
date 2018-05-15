/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici18;

/**
 *
 * @author jcc30
 */
public class Line extends Figure{

    @Override
    public void clickButtonOn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GeometricFigure makeGeoFigure() {
        return new GeometricFigureLine(this);
    }
    
}
