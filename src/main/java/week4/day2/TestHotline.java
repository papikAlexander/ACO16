package week4.day2;

import week4.day1.Task.Product;

/**
 * Created by Alexander on 30.10.2016.
 */
public class TestHotline {

    public static void main(String[] args) {
        Repka repka = new Repka();

        Product product = new Product("IPhone");
        Product product1 = new Product("Samsung");
        Product product2 = new Product("Sony");
        Product product3 = new Product("LG");

        repka.addProduct(product);
        repka.addProduct(product1);
    }
}
