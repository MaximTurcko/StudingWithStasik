package main;

public class homework2 {
    public static void main(String[] args) {

    printArray1(getArray1());
    printArray2(getArray2());
    multiplyArrays(getArray1(),getArray2());
    }

    public static int[][] getArray1(){
        return new int[][]{
                {1, 0, 3},
                {0, 1, 0},
                {0, 0, 0}
        };
    }

    public static int[][] getArray2(){
        System.out.println();
        return new int[][]{
                {1, 2, 3},
                {1, 1, 1},
                {2, 1, 0}
        };
    }

    public static void printArray1(int[][] array1){
        for(int[] outer : array1){
            for (int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    public static void printArray2(int[][] array2){
        for(int[] outer : array2){
            for (int inner : outer){
                System.out.print(inner + "\t");
            }
            System.out.println();
        }
    }

    public static void multiplyArrays(int[][] array1, int[][] array2){
        int[][] result = new int[3][3];
        for(int outer = 0; outer < array1.length; outer++ ){
            for (int inner = 0; inner < array1[outer].length; inner++) {
                if (outer == 0 && inner == 0){
                    result[outer][inner] = array1[outer][inner] * array2[outer][inner] +
                            array1[outer][inner+1] * array2[outer+1][inner] +
                            array1[outer][inner+2] * array2[outer+2][inner];
                    System.out.print(result[outer][inner] + "\t");

                }
            }
        }
    }

}
