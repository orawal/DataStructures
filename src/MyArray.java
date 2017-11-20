import java.util.Arrays;

/**
 * Created by oshinrawal on 11/19/17.
 */
public class MyArray {
    private String[] array;
    private int size;

    public MyArray(int initialCapacity) {
        array = new String[initialCapacity];
        size = 0;
    }

    public void add(String text) {
        if(needDoubleCapacity()) {
            doubleCapacity();
        }
        array[size] = text;
        size++;
    }

    public boolean search(String key) {
        for(int i = 0; i < size; i++) {
            if(array[i].equals(key))
                return true;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void display() {
        if(size() > 0) {
            for(String element: array)
                System.out.print(element + " ");
        } else {
            System.out.println("Array contains no elements.");
        }
    }

    public void removeDups() {

    }

    private boolean needDoubleCapacity() {
        return size == getCapacity();
    }

    private void doubleCapacity() {
        int currentCapacity = getCapacity();
        int newCapacity;
        if(currentCapacity == 0)
            newCapacity = 1;
        else
            newCapacity = currentCapacity * 2;
        String[] newArray = Arrays.copyOf(array, newCapacity);
        array = newArray;
    }

    public static void main(String[] args) {
        MyArray arr = new MyArray(0);
        arr.add("text");
    }
}
