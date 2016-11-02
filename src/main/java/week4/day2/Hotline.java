package week4.day2;

import week4.day1.Task.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Alexander on 30.10.2016.
 */
public class Hotline {
    private List<Product> productList = new LinkedList<>();

    public void addProducts(Iterable<Product> iterable){
        Iterator<Product> iterator = iterable.iterator();

        while (iterator.hasNext()){
            productList.add(iterator.next());
        }
    }

    @Override
    public String toString() {
        return "Hotline{" +
                "productList=" + productList +
                '}';
    }
}
