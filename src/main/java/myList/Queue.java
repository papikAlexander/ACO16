package myList;

/**
 * Created by Alexander on 04.11.2016.
 */
public interface Queue<E> {
    boolean add(E o);
    E element();
    boolean offer(E o);
    E peek();
    E poll();
    E remove();


}
