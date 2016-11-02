package myList;

import java.util.Iterator;

/**
 * Created by Alexander on 23.10.2016.
 */
public class MyLinkedList<T> implements MyList<T>{

    private int size;
    private Node<T> head;
    private Node<T> tail;

    public MyLinkedList() {
    }

    public int size(){
        return size;
    }

    public boolean add(T o){

        if(tail == null){
            head = tail = new Node<>(o);
            size++;
            return true;
        }

        tail.setNext(new Node<>(tail, o));
        tail = tail.getNext();
        size++;

        return true;
    }

    @Override
    public void add(int index, T o) {

    }

    public T get(int index){

        checkIndex(index);

        Node<T> iterator = head;
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }

        return iterator.getValue();
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public int indexOf(T o) {

        return 0;
    }

    @Override
    public boolean set(int index, T o) {
        return false;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<T> iterator() {

        return new MyLinkedListIterator();
    }

    private static class Node<T> {
        private Node<T> next;
        private Node<T> previous;

        private T value;

        Node(){

        }
        public Node(Node<T> next, Node<T> previous, T value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        Node(T value) {
            this.value = value;
        }

        Node(Node<T> previous, T value) {
            this.previous = previous;
            this.value = value;
        }

        Node<T> getPrevious() {
            return previous;
        }

        void setPrevious(Node<T> previous) {
            this.previous = previous;
        }

        Node<T> getNext() {
            return next;
        }

        void setNext(Node<T> next) {
            this.next = next;
        }

        T getValue() {
            return value;
        }
        void setValue(T value) {
            this.value = value;
        }

    }

    private class MyLinkedListIterator implements Iterator<T> {

        private Node<T> iterator;

        public MyLinkedListIterator(){
            iterator = new Node<>();
            iterator.next = head;
        }



        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public T next() {
            iterator = iterator.next;
            return iterator.value;
        }
    }
}
