package main;

import java.util.Scanner;

public class homeWork0 {
    public static void main(String[] args) {
        set3dArray();

    }

    ;

    public static void set3dArray() {
        int[][][] array3d = new int[][][]{
                {       {1, 2}, //[0][0][0], [0][0][1],
                        {3}     //[0][1][0]
                },
                {       {4, 8},    //[1][0][0], [1][0][1]
                        {5, 6, 7}  //[1][1][0], [1][1][1], [1][1][2]
                }
        };
        get3dArray(array3d);

    }
    public static void get3dArray(int[][][] array3d){
        int number = input().nextInt();
        for (int outher = 0; outher < array3d.length; outher++){
            for (int inner = 0; inner < array3d[outher].length; inner++){
                for (int deep = 0; deep < array3d[outher][inner].length; deep++){
                    array3d[outher][inner][deep] += + number;
                    System.out.print(array3d[outher][inner][deep]+ "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static Scanner input(){
        return new Scanner(System.in);
    }

}
