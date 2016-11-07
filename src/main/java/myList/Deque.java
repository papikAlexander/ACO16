package myList;

/**
 * Created by Alexander on 04.11.2016.
 */
public interface Deque<E> extends Queue<E> {
    void addFirst(E e);
    void addLast(E e);
    E getFirst();
    E getLast();
    boolean offerFirst(E e);
    boolean offerLast(E e);
    E peekFirst();
    E peekLast();
    E pollFirst();
    E pollLast();
    void push(E e);
    E removeFirst();
    E removeLast();
}
