package HW8_1;

public class Triangle extends Rectangle{
     private int hypotenuse;
    public Triangle(int length, int  height, int hypotenuse){
        super(length, height);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public void calculateArea() {
        System.out.println("Area of Triangle is :" + (length + height)/2);

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("Perimeter of Rectangle is :" + this.length + height + hypotenuse);

    }
}
