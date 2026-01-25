package main;

public class homeWork4 {
    public static void main(String[] args) {
        theFirstDiagonal(getArray1());
        theSecondDiagonal(getArray1());
    }

    public static void theFirstDiagonal(int[][] array1) {
        System.out.print("Главная диагональ: ");
        for (int outer = 0; outer < array1.length; outer++) {
            for (int inner = 0; inner < array1[outer].length; inner++) {
                if (outer == inner) {
                    System.out.print(array1[outer][inner] + "\t");
                }
            }
        }
        System.out.println();
    }

    public static void theSecondDiagonal(int[][] array1) {
        System.out.print("Побочная диагональ: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i][array1.length - 1 - i] + "\t");
        }

    }

    public static int[][] getArray1() {
        return new int[][]{
                {1, 0, 3},
                {0, 1, 0},
                {0, 0, 5}
        };
    }
}
