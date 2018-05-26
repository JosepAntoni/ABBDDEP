package ex6;

public class Rectangle extends Figure {
    
    private final float width;
    private final float height;
    
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
    public Figure copy() {
        return this;
    }

    @Override
    public Figure deepCopy() {
        return new Rectangle(this);
    }
    
}
