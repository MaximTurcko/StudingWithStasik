import java.util.Scanner;

public class HW0 {

    public static void main(String[] args) {
        getDz3_1();
        //getDz3_2();
        //getDz3_3();
        //getDz3_4();
    }


    public static void getDz3_1(){
        System.out.print("Please enter number time of year from 1 to 12: ");
        int month = input().nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("You entered " + month + ". Its winter");
        } else if (month >=3 && month <=5){
            System.out.println("You entered " + month + ". Its spring");
        } else if (month >=6 && month <=8){
            System.out.println("You entered " + month + ". Its summer");
        } else if (month >=9 && month <=11){
            System.out.println("You entered " + month + ". Its autumn");
        } else {
            System.out.println("Все херня! Давай по новой!");
        }
    }

    public static void getDz3_2() {
        System.out.print("Please enter number time of year from 1 to 12: ");
        int month = input().nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("You entered " + month + ". Its winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("You entered " + month + ". Its spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("You entered " + month + ". Its summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("You entered " + month + ". Its autumn");
                break;
            default:
                System.out.println("Дебил! На китайском написать? от 1 до 12!");
        }

    }

    public static void getDz3_3(){
        System.out.println("Please enter your number. Ill show you your result: ");
        int number = input().nextInt();
        int number1 = number%2;
        if(number1 == 1){
            System.out.println("Остаток 1. Не четное");
        } else System.out.println("Остаток 0. Четное");

    }

    public static void getDz3_4(){
        System.out.print("please enter temperature: ");
        int t = input().nextInt();
        if ( t > -5) {
            System.out.println("Тепло");
        } else if (t <= -5 && t > -20){
            System.out.println("Нормально");
        } else if (t >= -20) {
            System.out.println("Холодно");
        } else System.out.println("Error!");
    }

    public static Scanner input() {
        return new Scanner(System.in);
    }

}


