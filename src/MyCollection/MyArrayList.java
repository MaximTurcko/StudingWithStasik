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
            if (this.size < capasity) {
                for (int i = index + 1, o = index; i < array.length; i++) {
                    String x = array[o];
                    array[i] = x;
                    o++;
                }
                array[index] = t.toString();
                size++;
            } else {
                this.capasity *= 1.5;
                String[] newArray = new String[capasity];
                newArray[index] = t.toString();
                for (int i = 0, o = 0; i < array.length; i++) {
                    if (newArray[i] == null) {
                        newArray[i] = array[o];
                        o++;
                    }
                }
                this.array = newArray;
                size++;
            }
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
            if (size < 10) {
                this.capasity = 10;
            } else this.capasity /= 1.5;
            String[] newArray = new String[capasity];
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
