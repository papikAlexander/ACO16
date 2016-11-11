package myList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Alexander on 30.10.2016.
 */
public class MyLinkedListTest implements MyListTest {
    MyLinkedList<Object> linkedList;
    @Override @Before
    public void init() {
        linkedList = new MyLinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
    }

    @Override @Test
    public void testListSize() {
        assertEquals(3, linkedList.size());
    }

    @Override @Test
    public void testListAdd() {
        linkedList.add(5);
        assertTrue(linkedList.size() == 4);
    }

    @Override @Test
    public void testListIndexAdd() {
        linkedList.add(1, 5);
        assertEquals(5,linkedList.get(1));

    }

    @Test
    public void testListIndexAddBegin() {
        linkedList.add(0, 5);
        assertEquals(5,linkedList.get(0));

    }

    @Override @Test
    public void testListSizeAfterAdd() {
        linkedList.add(5);
        assertEquals(4, linkedList.size());
    }

    @Override @Test
    public void testListGet() {
        assertEquals(2, linkedList.get(2));
    }



    @Override @Test
    public void testListClear() {
        linkedList.clear();
        assertEquals(0, linkedList.size());

    }

    @Override @Test
    public void testListContains() {
        assertTrue(linkedList.contains(1));
    }

    @Override @Test
    public void testListRemoveIndex() {
        linkedList.remove(1);
        assertEquals(2, linkedList.size());
    }

    @Override @Test
    public void testListRemoveObject() {
        Object i = 1;
        linkedList.remove(i);
        assertEquals(2, linkedList.size());
    }

    @Override @Test
    public void testListSet() {
        linkedList.set(1, 5);
        assertEquals(5, linkedList.get(1));
    }

    @Test
    public void testListSetInBegin() {
        linkedList.set(0, 5);
        assertEquals(5, linkedList.get(0));
    }

    @Test
    public void testListSetInEnd() {
        linkedList.set(2, 5);
        assertEquals(5, linkedList.get(2));
    }

    @Test
    public void testIterator() {

        linkedList.add("0");
        linkedList.add("1");

        Iterator iterator = linkedList.iterator();
        for (int i = 0; i < linkedList.size(); i++) {
            Assert.assertSame(linkedList.get(i), iterator.next());

        }
    }
    @Test
    public void testCheckEmpty(){

    }
}
