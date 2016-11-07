package myList;

/**
 * Created by Alexander on 23.10.2016.
 */
public interface MyList<E> extends Iterable{

    int size();
    boolean add(E o);
    void add(int index, E o);
    E get(int index);
    void clear();
    boolean contains(E o);
    E remove(int index);
    boolean remove(E o);
    int indexOf(E o);
    E set(int index, E o);

}
