package MyCollection;

public class MyArrayList<T> {
    int capasity;
    int size = 0;
    String[] array;

    public MyArrayList(int size) {
        this.size = size;
        array = new String[size];
    }

    public MyArrayList() {
        this.capasity = 10;
        array = new String[capasity];
    }

    public void add(T t) {
        if (this.size < capasity) {
            array[size] = t.toString();
            size++;
        } else {
            this.capasity *= 1.5;
            String[] newArray = new String[capasity];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = this.array[i];
            }
            this.array = newArray;
            array[size] = t.toString();
            size++;
        }
    }

    public void add(T t, int index) {
        if (array[index] != null) {
            String[] newArray = new String[capasity + 1];
            newArray[index] = t.toString();
            for (int i = 0, o = 0; i < newArray.length; i++) {
                if (newArray[i] == null) {
                    newArray[i] = array[o];
                    o++;
                }
            }
            array = newArray;
            size++;
            capasity++;
        } else if (this.size == index) add(t);
        else System.out.println("It's EMPTY. You can't to fill in this index!");
    }

    public void checkElement(T t) {
        boolean isExist = true;
        for (String el : array) {
            if (el != t.toString()) {
                isExist = false;
            }
        }
        if (isExist) {
            System.out.println("This array HAS this element: " + t);
        } else System.out.println("This array DOESN'T has this element: " + t);
    }

    public void remove(int index) {
        array[index] = null;
        if (size < capasity / 1.5) {
            if(size < 13){
                this.capasity = 10;
                String[] newArray = new String[capasity - 1];
                for (int i = 0, o = 0; i < array.length; i++) {
                    if (array[i] != null) {
                        newArray[o] = array[i];
                        o++;
                    }
                }
                array = newArray;
                size--;
            }
            this.capasity /= 1.5;
            String[] newArray = new String[capasity - 1];
            for (int i = 0, o = 0; i < array.length; i++) {
                if (array[i] != null) {
                    newArray[o] = array[i];
                    o++;
                }
            }
            array = newArray;
            size--;
        } else size--;
    }

    public void removeAll() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
            size = 0;
        }
    }

    public void getArrayIndex(int index) {
        System.out.println(array[index]);
    }

    public void printFullArray() {
        for (String str : array) {
            System.out.print(str + "\t");
        }
        System.out.println();
    }
}
