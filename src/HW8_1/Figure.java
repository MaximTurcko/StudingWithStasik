package HW8_1;

public abstract class Figure {
    private Figure[] figures;
    public abstract int getcalculateArea();
    public abstract int getcalculatePerimeter();
    public Figure(Figure... figures){
        this.figures= figures;
    }
}
