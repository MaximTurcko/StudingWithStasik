package HW8_1;

public abstract class Figure {
    private int length;
    private int height;
    public abstract void calculateArea();
    public abstract void
    calculatePerimeter();
    public Figure(int length, int height){
        this.length = length;
        this.height = height;
    }
}
