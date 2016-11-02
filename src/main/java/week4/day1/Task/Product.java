package week4.day1.Task;

/**
 * Created by Alexander on 29.10.2016.
 */
public class Product {
    private String name;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }

    public Product(String name) {
        this.name = name;
    }
}
