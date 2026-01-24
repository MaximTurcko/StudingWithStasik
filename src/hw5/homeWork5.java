package main;

public class homeWork5 {
    public static void main(String[] args) {
        calculateResult();
        //test();
    }

    public static void calculateResult() {
        int[][] array = new int[][]{
            {3, 2, 1},
            {6, 5, 4},
            {7, 8, 9}
        };

        int sum = 0;
        for (int outer = 0; outer < array.length; outer++) {
            for (int inner = 0; inner < array[outer].length; inner++) {
                for (int i = 0; i < array.length-1; i++) {
                    for (int j = 0; j < array.length-i-1; j++) {
                        if (array[outer][j] > array[outer][j + 1]) {
                            // Меняем arraytest[j] и arraytest[j+1]
                            int temp = array[outer][j];
                            array[outer][j] = array[outer][j + 1];
                            array[outer][j + 1] = sum;
                        }
                    }
                }

            }
        }
        for(int[] outer : array){
            for (int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
        }
    }

