package week4.day1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 29.10.2016.
 */
public class TestBinarySearch {
    List list;
    @Before
    public void CreateList() {
        list = new ArrayList();

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
    }

    @Test
    public void testBinarySearchListNull(){
        List list = new ArrayList();
        Assert.assertFalse(BinarySearch.binarySearch(list, 0));
    }

    @Test
    public void testBinarySearchObjectNull(){
        Assert.assertFalse(BinarySearch.binarySearch(list, null));
    }

    @Test
    public void testBinarySearch(){
        Assert.assertTrue(BinarySearch.binarySearch(list, 2));
    }

    @Test
    public void testBinarySearchNotFindListMore(){
        Assert.assertFalse(BinarySearch.binarySearch(list, 4));
    }

    @Test
    public void testBinarySearchNotFindListLess(){
        Assert.assertFalse(BinarySearch.binarySearch(list, -1));
    }
}
