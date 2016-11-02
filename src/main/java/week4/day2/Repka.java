package week4.day2;

import week4.day1.Task.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alexander on 30.10.2016.
 */
public class Repka  implements Iterable<Product>{
    private List<Product> products = new ArrayList<>();
    private int currentPosition;

    @Override
    public String toString() {
        return "Repka{" +
                "products=" + products +
                ", currentPosition=" + currentPosition +
                '}';
    }

    public boolean addProduct(Product product){
        if(product == null) return false;
        return products.add(product);
    }

    @Override
    public Iterator<Product> iterator() {
        return null;// new RepkaIterator(this);
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }
}
