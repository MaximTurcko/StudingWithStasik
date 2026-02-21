package HW8_1;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public int getcalculatePerimeter() {
        System.out.println("Perimeter of Circle is: " + this.radius*2*3);
        return this.radius*2*3;
    }

    @Override
    public int getcalculateArea() {
        System.out.println("Area of Circle is: " + this.radius*2*2*3);
        return this.radius*2*2*3;
    }
}
