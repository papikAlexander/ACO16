package week2.day2;

/**
 * Created by Alexander on 16.10.2016.
 */
public class MyArrayList {
    private Object[] elementData;
    private int size;
    private int dafaultCapacity = 10;

    public MyArrayList(){
        elementData = new Object[dafaultCapacity];
    }

    public MyArrayList(int capacity){
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    public boolean add(Object o) {

        elementData[size++] = o;

        return true;
    }
}
