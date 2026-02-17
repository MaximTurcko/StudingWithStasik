package HW8_1;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle is :" + this.radius*2*3);
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle is :" + this.radius*2*2*3);
    }
}
