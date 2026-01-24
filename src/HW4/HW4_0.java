package HW4;

import java.util.Scanner;

public class HW4_0 {
    public static void main(String[] args) {
        get2Array();
    }

    public static void getDz4_1() {
        System.out.println("Please, enter your number: ");
        int[] mass = new int[]{1, 4, 8, 7, 5};
        int numner = input().nextInt();

        for(int index = 0; index < mass.length; ++index) {
            if (numner == mass[index]) {
                System.out.println(mass[index]);
                System.out.println("Есть пробитие!");
                return;
            }
        }

        System.out.println("Нет пробития!");
    }

    public static void getDz4_2() {
        System.out.print("Please, enter your number: ");
        int[] mass = new int[]{1, 5, 8, 7, 5};
        int numner = input().nextInt();
        boolean no = true;

        for(int index = 0; index < mass.length; ++index) {
            if (numner == mass[index]) {
                mass[index] = 0;
                no = false;
            }
        }

        if (no) {
            System.out.println("Нет пробитий!");
        } else {
            for(int index = 0; index < mass.length; ++index) {
                System.out.print(mass[index] + "\t");
            }

        }
    }

    public static void getDz4_3() {
        System.out.print("Please, enter your number: ");
        int massLengh = input().nextInt();
        double[] mass = new double[massLengh];

        for(int i = 0; i < mass.length; ++i) {
            mass[i] = Math.random() * (double)10.0F;
            mass[i] = (double)Math.round(mass[i]);
        }

        System.out.print("Array: ");

        for(double el : mass) {
            System.out.print(el + "\t");
        }

        System.out.println();
        double avg = (double)0.0F;

        for(int i = 0; i < mass.length; ++i) {
            avg += mass[i];
        }

        avg /= (double)massLengh;
        avg = (double)Math.round(avg);
        System.out.println("Avarage: " + avg);
        double min = mass[0];

        for(int i = 0; i < mass.length; ++i) {
            if (min >= mass[i]) {
                min = mass[i];
            }
        }

        System.out.println("Minimum: " + min);
        double max = mass[0];

        for(int i = 0; i < mass.length; ++i) {
            if (max <= mass[i]) {
                max = mass[i];
            }
        }

        System.out.println("Maximum: " + max);
    }

    public static void get2Array() {
        int[] array1 = new int[]{1, 5, 8, 7, 5};
        System.out.print("Array1: ");

        for(int el1 : array1) {
            System.out.print(el1 + "\t");
        }

        System.out.println();
        int[] array2 = new int[]{9, 6, 9, 8, 9};
        System.out.print("Array2: ");

        for(int el2 : array2) {
            System.out.print(el2 + "\t");
        }

        System.out.println();
        int avg1 = 0;

        for(int i = 0; i < array1.length; ++i) {
            avg1 += array1[i];
        }

        avg1 /= array1.length;
        System.out.println("Avarage1: " + avg1);
        int avg2 = 0;

        for(int i = 0; i < array2.length; ++i) {
            avg2 += array2[i];
        }

        avg2 /= array1.length;
        System.out.println("Avarage2: " + avg2);
        if (avg1 > avg2) {
            System.out.println("Array1 more then array2");
        } else if (avg1 < avg2) {
            System.out.println("Array2 more then array1");
        } else {
            System.out.println("Array1 = Array2");
        }

    }

    public static Scanner input() {
        return new Scanner(System.in);
    }
}

