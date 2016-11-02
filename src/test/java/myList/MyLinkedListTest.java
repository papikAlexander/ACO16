package myList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

/**
 * Created by Alexander on 30.10.2016.
 */
public class MyLinkedListTest implements MyListTest {
    MyLinkedList<Object> linkedList;
    @Override @Before
    public void init() {
        linkedList = new MyLinkedList<>();
    }

    @Override
    public void testListSize() {

    }

    @Override
    public void testListAdd() {

    }

    @Override
    public void testListIndexAdd() {

    }

    @Override
    public void testListSizeAfterAdd() {

    }

    @Override
    public void testListGet() {

    }

    @Override
    public void testListGetNull() {

    }

    @Override
    public void testListClear() {

    }

    @Override
    public void testListContains() {

    }

    @Override
    public void testListContainsAfterClear() {

    }

    @Override
    public void testListRemoveIndex() {

    }

    @Override
    public void testListRemoveObject() {

    }

    @Override
    public void testListSet() {

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
}
