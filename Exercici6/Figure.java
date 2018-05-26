package ex6;

public abstract class Figure {

    private final float x;
    private final float y;
    
    public Figure(float x, float y){
        this.x = x;
        this.y = y;
    }
    
    public Figure(Figure f){
        this.x = f.x;
        this.y = f.y;
    }
    
    public abstract Figure copy();
    public abstract Figure deepCopy();
    
}
