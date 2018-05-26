package ex6;

public class Circle extends Figure {

    private final float r;
    
    public Circle(float x, float y, float r){
        super(x, y);
        this.r = r;
    }

    public Circle(Circle c){
        super(c);
        this.r = c.r;
    }
    
    @Override
    public Figure copy() {
        return this;
    }

    @Override
    public Figure deepCopy() {
        return new Circle(this);
    }
    
}
