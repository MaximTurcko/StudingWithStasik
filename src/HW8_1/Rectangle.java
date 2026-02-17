package HW8_1;

public class Rectangle extends Figure {
    protected int length;
    protected int height;
    public Rectangle(int length, int  height){
       this.length = length;
       this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Rectangle is :" + (this.length + height)*2);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Area of Rectangle is :" + (length + height)*2);

    }
}
