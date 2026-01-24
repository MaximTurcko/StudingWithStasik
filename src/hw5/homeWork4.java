package main;

public class homeWork4 {
    public static void main(String[] args) {
        calculateResult(getArray1());
    }

    public static void calculateResult(int[][] array1) {
        int sum = 0;
        for (int outer = 0; outer < array1.length; outer++) {
            for (int inner = 0; inner < array1[outer].length; inner++) {
                if (outer == inner){
                    System.out.print(array1[outer][inner] + "\t");
                }
            }
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
