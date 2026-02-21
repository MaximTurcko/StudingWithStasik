package HW8_1;

public class Main {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(10, 12);
        Triangle triangle = new Triangle(11, 12, 13);
        Circle circle = new Circle(10);
        Figure[] figures = new Figure[]{rectangle, triangle, circle};
        System.out.println("*****************************************");
        int sumArea = 0;
        for (int i = 0; i < figures.length; i++) {
            sumArea += figures[i].getcalculateArea();
        }
        System.out.println("*****************************************");
        int sumPerimeter = 0;
        for (int i = 0; i < figures.length; i++) {
            sumPerimeter += figures[i].getcalculatePerimeter();
        }
        System.out.println("*****************************************");
        System.out.println("Sum of Perimeters is:  " + sumPerimeter);
        System.out.println("Sum of Area is:  " + sumArea);
    }
}

