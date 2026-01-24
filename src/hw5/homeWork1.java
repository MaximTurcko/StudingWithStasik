package main;

public class homeWork1 {
    public static void main(String[] args) {
        getArray();

    }

    public static void getArray() {
        String[][] array = new String[][]{
                {"W", "B", "W", "B", "W", "B", "W", "B",},
                {"B", "W", "B", "W", "B", "W", "B", "W",},
                {"W", "B", "W", "B", "W", "B", "W", "B",},
                {"B", "W", "B", "W", "B", "W", "B", "W",},
                {"W", "B", "W", "B", "W", "B", "W", "B",},
                {"B", "W", "B", "W", "B", "W", "B", "W",},
                {"W", "B", "W", "B", "W", "B", "W", "B",},
                {"B", "W", "B", "W", "B", "W", "B", "W",},
                {"W", "B", "W", "B", "W", "B", "W", "B",}

        };
        getArraysColor(array);
    }

    public static void getArraysColor(String[][] array ){
        for (int outer = 0; outer < array.length; outer++){
            for (int inner = 0; inner < array[outer].length; inner++){
                if (array[outer][inner] == "W"){
                    array[outer][inner] = "White";

                }else array[outer][inner] = "Black";
                System.out.print(array[outer][inner] + "\t");
            }
            System.out.println();
        }
    }
}
