package HW8_1;

public class Rectangle extends Figure {
    private int length;
    private int height;

    public Rectangle(int length, int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    public int getcalculateArea() {
        System.out.println("Area of Rectangle is: " + length * height);
        return length * height;
    }

    @Override
    public int getcalculatePerimeter() {
        System.out.println("Perimeter of Rectangle is: " + (this.length + height) * 2);
        return (this.length + height) * 2;
    }
}
