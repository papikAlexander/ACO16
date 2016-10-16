package week2.day2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Alexander on 16.10.2016.
 */
public class MyArrayListTest {
    MyArrayList myArrayList;

    @Before
    public  void init(){
        myArrayList = new MyArrayList();
    }

    @Test
    public void testArrayListAdd(){

        boolean actual = myArrayList.add("1");
        boolean expected = true;

        Assert.assertTrue(actual);
    }

    @Test
    public void testArrayListSizeAfterAdd(){

        myArrayList.add("1");

        Assert.assertEquals(1, myArrayList.size());
    }
}
