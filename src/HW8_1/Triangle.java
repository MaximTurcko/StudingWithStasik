package HW8_1;

public class Triangle extends Rectangle{
     private int hypotenuse;
    public Triangle(int length, int  height, int hypotenuse){
        super(length, height);
        this.hypotenuse = hypotenuse;
    }

    @Override
    public int getcalculateArea() {
        System.out.println("Area of Triangle is :" + (length + height)/2);
        return (length + height)/2;
    }

    @Override
    public int getcalculatePerimeter() {
        System.out.println("Perimeter of Rectangle is :" + this.length + height + hypotenuse);
        return this.length + height + hypotenuse;
    }
}
