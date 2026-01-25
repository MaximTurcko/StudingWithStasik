package main;

public class homeWork3 {
    public static void main(String[] args) {
        calculateResult(getArray1());
    }

    public static void calculateResult(int[][] array1) {
        int sum = 0;
        for (int outer = 0; outer < array1.length; outer++) {
            for (int inner = 0; inner < array1[outer].length; inner++) {
                sum += array1[outer][inner];
            }
        }
        System.out.println("Сумма всех элементов массива: " + sum);

    }

    public static int[][] getArray1() {
        return new int[][]{
                {1, 0, 3},
                {0, 1, 0},
                {0, 0, 5}
        };
    }
}
