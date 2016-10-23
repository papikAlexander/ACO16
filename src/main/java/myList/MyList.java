package myList;

/**
 * Created by Alexander on 23.10.2016.
 */
public interface MyList {
    int size();
    boolean add(Object o);
    void add(int index, Object o);
    Object get(int index);
    void clear();
    boolean contains(Object o);
    boolean remove(int index);
    boolean remove(Object o);
    int indexOf(Object o);
    boolean set(int index, Object o);



}
