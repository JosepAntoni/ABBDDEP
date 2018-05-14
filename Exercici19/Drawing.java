/*
 * This project has been developed by Josep Antoni Costa Camps
 */
package Exercici19;
import java.util.*;
/**
 *
 * @author jcc30
 */
public class Drawing extends Figure implements ItemElement{
    
    private final List<Figure> list;
    
    public Drawing(float x, float y) {
        super(x, y);
        this.list = new ArrayList<>();
    }
    
    public Drawing(Drawing d){
        super(d);
        this.list = new ArrayList<>();
        for(Figure f : d.list){
            this.list.add(f.copy());
        }
    }
    
    public void addFigure(Figure figure){
        getList().add(figure);
    }

    @Override
    public Drawing copy() {
        return new Drawing(this);
    }  

    /**
     * @return the list
     */
    public List<Figure> getList() {
        return list;
    }
    
    @Override
    public void accept(FigureVisitor scaler) {
        scaler.visit(this);
    }
}
