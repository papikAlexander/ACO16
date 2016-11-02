package myList;

import myList.MyArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Alexander on 16.10.2016.
 */
public class MyArrayListTest implements MyListTest{
    private MyArrayList<Object> myArrayList;

    @Before
    public  void init(){
        myArrayList = new MyArrayList<>();
    }

    @Test
    public void testListSize(){

        myArrayList.add("1");
        int actual = myArrayList.size();

        Assert.assertEquals(1, actual);
    }
    @Test
    public void testListAdd(){

        boolean actual = myArrayList.add("1");

        Assert.assertTrue(actual);
    }

    @Test
    public void testListIndexAdd(){
        myArrayList.add("1");
        myArrayList.add("1");
        myArrayList.add("1");
        myArrayList.add("1");
        System.out.println(myArrayList.size());
        myArrayList.add(2, "2");
        System.out.println(myArrayList.size());
        Object actual =  myArrayList.get(4);

        Assert.assertEquals("1", actual);
    }

    @Test
    public void testListSizeAfterAdd(){

        myArrayList.add("1");

        Assert.assertEquals(1, myArrayList.size());
    }

    @Test
    public void testListGet(){

        myArrayList.add("1");
        myArrayList.add("5");
        Object actual = myArrayList.get(1);
        Object expected = "5";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testListGetNull(){

        myArrayList.add("1");
        myArrayList.add("5");
        Object actual = myArrayList.get(20);

        Assert.assertEquals(actual, null);
    }

    @Test
    public void testListClear(){

        myArrayList.add("1");
        myArrayList.add(5);
        myArrayList.clear();

        Object[] actual = new Object[2];
        Object[] expected = new Object[2];

        for (int i = 0; i < 2; i++) {
            actual[i] = myArrayList.get(i);
            expected[i] = null;
        }

        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testListContainsAfterClear(){

        myArrayList.add("1");
        myArrayList.add(5);
        myArrayList.clear();

        boolean actual = myArrayList.contains(1);
        System.out.println(myArrayList.contains("1"));
        Assert.assertFalse(actual);
    }

    @Test
    public void testListContains(){
        myArrayList.add("1");
        myArrayList.add(1);
        boolean actual = myArrayList.contains(1);

        Assert.assertTrue(actual);
    }

    @Test
    public void testListRemoveIndex(){

        myArrayList.add("1");
        myArrayList.add(1);
        myArrayList.remove(0);
        Object actual = myArrayList.get(0);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testListRemoveObject(){

        myArrayList.add(null);
        myArrayList.add(1);
        myArrayList.remove(null);
        Object actual = myArrayList.get(0);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testListSet(){
        myArrayList.add("1");
        myArrayList.add(25);
        myArrayList.set(0, "5");
        Object actual = myArrayList.get(0);
        Assert.assertEquals("5", actual);
    }

    @Test
    public void testIterator() {
        myArrayList.add("1");
        myArrayList.add("2");
        myArrayList.add("3");


    }
}
