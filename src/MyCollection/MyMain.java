package MyCollection;

import java.util.Arrays;

public class MyMain {
    public static void main(String[] args) {
        MyArrayList<Integer> array1 = new MyArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(1);
        }
        array1.printFullArray();
//      array1.printFullArray();
      array1.add(2,0);
        array1.add(10,10);

//      array1.printFullArray();
//      array1.remove(1);
      array1.printFullArray();
            array1.remove(10);
        for (int i = 9; i >0 ; i--) {
            array1.remove(i);
        }
        System.out.println();
        array1.printFullArray();
    }
}
