package myList;

/**
 * Created by Alexander on 23.10.2016.
 */
public class MyLinkedList implements MyList{

    private int size;
    private Node head;
    private Node tail;

    public MyLinkedList() {
    }

    public int size(){
        return size;
    }

    public boolean add(Object o){

        if(tail == null){
            head = tail = new Node(o);
            size++;
            return true;
        }

        tail.setNext(new Node(tail, o));
        tail = tail.getNext();
        size++;

        return true;
    }

    @Override
    public void add(int index, Object o) {

    }

    public Object get(int index){

        checkIndex(index);

        Node iterator = head;
        for (int i = 1; i <= index; i++) {
            iterator = iterator.getNext();
        }

        return iterator.getValue();
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public boolean set(int index, Object o) {
        return false;
    }

    private void checkIndex(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    }
}
