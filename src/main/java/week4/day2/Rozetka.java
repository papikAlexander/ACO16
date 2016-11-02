/*
package week4.day2;

import week4.day1.Task.Product;

import java.util.Arrays;
import java.util.Iterator;

*/
/**
 * Created by Alexander on 30.10.2016.
 *//*

public class Rozetka implements Iterable<Product> {

    private Product[] products = new Product[10];

    private int size;

    public Product[] getProducts() {
        return products;
    }

    public int getSize() {
        return size;
    }

    public boolean addProduct(Product product){
        if (product == null || products.length == size) return false;
        products[size++] = product;
        return true;
    }

    @Override
    public String toString() {
        return "Rozetka{" +
                "products=" + Arrays.toString(products) +
                ", size=" + size +
                ", currentPosition=" + currentPosition +
                '}';
    }

    @Override
    public Iterator<Product> iterator() {
        return new RozetkaIterator(this);
    }
}
*/
