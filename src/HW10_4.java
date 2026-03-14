import java.util.Scanner;

public class HW10_4 {
    public static void main(String[] args) {
        checkPoliandrom();
    }

    public static void checkPoliandrom() {
        String words = "finished with level exit code";
        String[] arrayWords = words.split(" +");
        System.out.print("You have this world's array: ");
        for (String el : arrayWords) {
            System.out.print(el + " ");
        }
        System.out.println();
        System.out.print("You need to choose which word would you like to compare: ");
        int input = new Scanner(System.in).nextInt();
        try{
            StringBuilder str = new StringBuilder(arrayWords[input - 1]);
            if (str.reverse().toString().equals(arrayWords[input - 1])) {
                System.out.println("You chose: " + arrayWords[input - 1] + "\nThis word IS Poliadrom");
            } else System.out.println("You chose: " + arrayWords[input - 1] + "\nThis word ISN'T Poliadrom");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ты ввел херню!");
        }
    }
}
