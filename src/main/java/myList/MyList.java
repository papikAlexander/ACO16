package myList;

/**
 * Created by Alexander on 23.10.2016.
 */
public interface MyList<T> extends Iterable{

    int size();
    boolean add(T o);
    void add(int index, T o);
    T get(int index);
    void clear();
    boolean contains(T o);
    boolean remove(int index);
    boolean remove(T o);
    int indexOf(T o);
    boolean set(int index, T o);

}
