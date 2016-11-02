package myList;

import java.lang.reflect.Array;
import java.util.Iterator;

/**
 * Created by Alexander on 16.10.2016.
 */
public class MyArrayList<T> implements MyList<T>{
    private T[] elementData;
    private int size;
    private int defaultCapacity = 10;

    public MyArrayList(){
        elementData = (T[]) new Object[defaultCapacity];
    }

    public MyArrayList(int capacity){
        elementData = (T[]) new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    private boolean ensureCapacity(int oldCapacity){

        int newCapacity = (oldCapacity * 3) / 2 + 1;
        T[] tmp = elementData;
        elementData = (T[]) new Object[newCapacity];
        System.arraycopy(tmp, 0, elementData, 0, size);

        return true;
    }

    @Override
    public boolean add(T o) {

        if(elementData.length < size){
            ensureCapacity(elementData.length);
        }
        elementData[size++] = o;
        return true;
    }

    @Override
    public T get(int index){
        if(index < 0 || index >= elementData.length) return null;
        return elementData[index];
    }

    @Override
    public void add(int index, T o) {

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if(elementData.length < size){
            ensureCapacity(elementData.length);
        }

        System.arraycopy(elementData, index, elementData, index + 1, size++ - index);
        elementData[index] = o;

    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elementData[i] = null;
        }
        size = 0;
    }

    @Override
    public boolean contains(T o) {
        int index = this.indexOf(o);
        if(index >= 0){
            return true;
        }
        return false;
    }

    @Override
    public int indexOf(T o){
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean remove(int index) {

        if(size < index || index < 0) return false;

        System.arraycopy(elementData, index + 1, elementData, index, size - index - 1);
        elementData[--size] = null;
        return true;
    }

    @Override
    public boolean remove(T o) {
        int index = this.indexOf(o);
        if(index >= 0){
            this.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public boolean set(int index, T o) {

        if (index < 0 || index > size) throw new IndexOutOfBoundsException();

        if(o.equals(null)) return false;

        elementData[index] = o;
        return true;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArrayListIterator();
    }

    private class MyArrayListIterator implements Iterator<T> {
        private int currentPosition;
        @Override
        public boolean hasNext() {
            return currentPosition < size;
        }

        @Override
        public T next() {
            return elementData[currentPosition++];
        }
    }
}
