package myList;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Alexander on 23.10.2016.
 */
public class MyLinkedList<E> implements MyList<E>, Deque<E>{

    private int size;
    private Node<E> head = new Node<>();
    private Node<E> tail;

    public MyLinkedList() {
    }

    public int size(){
        return size;
    }

    public boolean add(E o){

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

    private  void newLink(Node<E> first, Node<E> second){
        first.setNext(second);
        second.setPrevious(first);
    }

    @Override
    public void add(int index, E o) {

        checkIndex(index);

        if (index == 0){
            addFirst(o);
            return;
        }

        Node<E> iterator = head;
        Node<E> tmp = new Node<>(o);
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }
        newLink(iterator.getPrevious(), tmp);
        newLink(tmp, iterator);
        size++;

    }

    @Override
    public void addFirst(E e) {
        head.setPrevious(new Node<>(head, null, e));
        head = head.getPrevious();
        size++;
        return;
    }

    @Override
    public void addLast(E e) {
        add(e);
    }

    public E get(int index){

        checkIndex(index);

        Node<E> iterator = head;
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }

        return iterator.getValue();
    }

    @Override
    public E getFirst() {
        checkEmpty();
        return head.value;
    }

    @Override
    public E getLast() {
        checkEmpty();
        return tail.value;
    }

    @Override
    public void clear() {
        Node<E> iterator = head;
        Node<E> previous;

        for (int i = 0; i < size; i++) {
            previous = iterator;
            iterator.setPrevious(null);
            iterator = iterator.getNext();
            previous.setNext(null);
        }
        size = 0;
    }

    @Override
    public boolean contains(E o) {
        if (indexOf(o) >= 0) return true;
        return false;
    }

    @Override
    public E remove(int index) {

        checkIndex(index);

        if (index == 0){
            remove();
        }
        if (index == size - 1){
            removeLast();
            return head.getValue();
        }

        Node<E> iterator = head;

        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }
        Node<E> tmp = iterator;
        newLink(iterator.getPrevious(), iterator.getNext());
        tmp.setPrevious(null);
        tmp.setNext(null);
        size--;
        return head.getValue();
    }

    @Override
    public boolean remove(E o) {
        int index = indexOf(o);
        if (index < 0) {
            return false;
        } else {
            remove(index);
            return true;
        }
    }

    @Override
    public E remove() {
        checkEmpty();
        Node<E> iterator = head;
        head = head.getNext();
        head.setPrevious(null);
        iterator.setNext(null);
        size--;
        return head.getValue();
    }

    @Override
    public E removeFirst() {
        checkEmpty();
        return remove();
    }

    @Override
    public E removeLast() {
        checkEmpty();

        Node<E> iterator = tail;
        tail = tail.getPrevious();
        tail.setNext(null);
        iterator.setPrevious(null);
        size--;
        return tail.getValue();
    }

    @Override
    public int indexOf(E o) {

        Node<E> iterator = head;

        for (int i = 0; i < size; i++) {
            if (iterator.value.equals(o)) return i;
            iterator = iterator.getNext();
        }

        return -1;
    }

    @Override
    public E set(int index, E o) {

        checkIndex(index);

        if (index == 0){
            Node<E> tmp = head;
            head = new Node<>(head.getNext(), null, o);
            tmp.setNext(null);
            head.getNext().setPrevious(head);
            return head.getValue();
        }
        if (index == size - 1){
            Node<E> tmp = tail;
            tail = new Node<>(null, tail.getPrevious(), o);
            tmp.setPrevious(null);
            tail.getPrevious().setNext(tail);
            return head.getValue();
        }

        Node<E> iterator = head;
        Node<E> newNode = new Node<>(o);

        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }

        Node<E> tmp = iterator;
        newLink(iterator.getPrevious(), newNode);
        newLink(newNode, iterator.getNext());
        tmp.setNext(null);
        tmp.setPrevious(null);

        return head.getValue();
    }

    private void checkEmpty(){
        if (size == 0) throw new NoSuchElementException();
    }

    private void checkIndex(int index) {

        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }

    @Override
    public Iterator<E> iterator() {

        return new MyLinkedListIterator();
    }

    @Override
    public boolean offer(E o) {
        return add(o);
    }

    @Override
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }

    @Override
    public boolean offerLast(E e) {
        add(e);
        return true;
    }

    @Override
    public E peek() {

        if (size == 0) return null;

        Node<E> tmp = head;
        head.setValue(null);
        return tmp.getValue();
    }

    @Override
    public E peekFirst() {
        if (size == 0) return null;
        return peek();
    }

    @Override
    public E peekLast() {
        if (size == 0) return null;
        Node<E> tmp = tail;
        tail.setValue(null);
        return tmp.getValue();
    }

    @Override
    public E poll() {

        if (size == 0) return null;

        Node<E> tmp = head;
        removeFirst();
        return tmp.getValue();
    }

    @Override
    public E pollFirst() {
        return poll();
    }

    @Override
    public E pollLast() {
        if (size == 0) return null;
        return removeLast();
    }

    @Override
    public void push(E e) {
        addFirst(e);
    }

    @Override
    public E element() {

        checkEmpty();

        Node<E> tmp = head;
        head.setValue(null);
        return tmp.getValue();
    }

    private static class Node<E> {
        private Node<E> next;
        private Node<E> previous;

        private E value;

        Node(){}
        public Node(Node<E> next, Node<E> previous, E value) {
            this.next = next;
            this.previous = previous;
            this.value = value;
        }

        Node(E value) {
            this.value = value;
        }

        Node(Node<E> previous, E value) {
            this.previous = previous;
            this.value = value;
        }

        Node<E> getPrevious() {
            return previous;
        }

        void setPrevious(Node<E> previous) {
            this.previous = previous;
        }

        Node<E> getNext() {
            return next;
        }

        void setNext(Node<E> next) {
            this.next = next;
        }

        E getValue() {
            return value;
        }
        void setValue(E value) {
            this.value = value;
        }

    }

    private class MyLinkedListIterator implements Iterator<E> {

        private Node<E> iterator;

        public MyLinkedListIterator(){
            iterator = new Node<>();
            iterator.next = head;
        }

        @Override
        public boolean hasNext() {
            return iterator.next != null;
        }

        @Override
        public E next() {
            iterator = iterator.next;
            return iterator.value;
        }
    }
}
