package week2.day2;

import java.lang.reflect.Array;

/**
 * Created by Alexander on 16.10.2016.
 */
public class MyArrayList {
    private Object[] elementData;
    private int size;
    private int defaultCapacity = 10;

    public MyArrayList(){
        elementData = new Object[defaultCapacity];
    }

    public MyArrayList(int capacity){
        elementData = new Object[capacity];
    }

    public int size() {
        return size;
    }

    private boolean ensureCapacity(int oldCapacity){

        int newCapacity = (oldCapacity * 3) / 2 + 1;
        Object[] tmp = elementData;
        elementData = new Object[newCapacity];
        System.arraycopy(tmp, 0, elementData, 0, size);

        return true;
    }

    public boolean add(Object o) {

        if(elementData.length - 1 == size){
            ensureCapacity(elementData.length);
        }

        System.out.println();
        elementData[size++] = o;

        return true;
    }

    public Object get(int index){
        if (index > elementData.length - 1){
            return null;
        }
        return elementData[index];
    }

    public boolean add(int index, Object o) {
        if(o == null) return true;

        while(elementData.length - 1 < index){
            ensureCapacity(elementData.length);
        }

        elementData[index] = o;

        return true;
    }

    public boolean clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
        return true;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
            if (o == elementData[i]) return true;
        }
        return false;
    }


    public boolean remove(int index) {

        if(size < index) return false;

        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[size--] = null;
        return true;
    }

    public boolean remove(Object o) {

        if(o == null) return false;

        for (int i = 0; i < size; i++) {
            if(elementData[i] == o){
                System.arraycopy(elementData, i + 1, elementData, i, size - i - 1);
                elementData[size--] = null;
                return true;
            }
        }
        return false;
    }

    public boolean set(int index, Object o) {
        if(o == null) return false;

        while(elementData.length - 1 < index){
            ensureCapacity(elementData.length);
        }
        elementData[index] = o;
        return true;
    }
}
