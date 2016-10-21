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

        if(elementData.length < size){
            ensureCapacity(elementData.length);
        }
        elementData[size++] = o;
        return true;
    }

    public Object get(int index){
        if(index < 0 || index >= elementData.length) return null;
        return elementData[index];
    }

    public void add(int index, Object o) {
        if (index < 0 || index > size) {
            System.out.println("IndexOutOfBoundsException");
            return;
        }
        if(o.equals(null)) return;

        System.arraycopy(elementData, index, elementData, index + 1, size++ - index);
        elementData[index] = o;

    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    public boolean contains(Object o) {
        if(size == 0) return false;
        for (int i = 0; i < size; i++) {
            if (o.equals(elementData[i])) return true;
        }
        return false;
    }


    public boolean remove(int index) {

        if(size < index || index < 0) return false;

        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[--size] = null;
        return true;
    }

    public boolean remove(Object o) {

        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    this.remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (elementData[i].equals(o)) {
                    this.remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean set(int index, Object o) {
        if (index < 0 || index > size) {
            System.out.println("IndexOutOfBoundsException");
            return false;
        }
        if(o.equals(null)) return false;

        elementData[index] = o;
        return true;
    }
}
