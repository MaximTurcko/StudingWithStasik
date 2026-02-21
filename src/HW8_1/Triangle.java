package HW8_1;

public class Triangle extends Figure {
    private int length;
    private int height;
    private int hypotenuse;

    public Triangle(int length, int height, int hypotenuse) {
        this.length = length;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    @Override
    public int getcalculateArea() {
        System.out.println("Area of Triangle is: " + (length + height) / 2);
        return (length + height) / 2;
    }

    @Override
    public int getcalculatePerimeter() {
        System.out.println("Perimeter of Triangle is: " + (this.length + this.height + hypotenuse));
        return this.length + this.height + hypotenuse;
    }
}
