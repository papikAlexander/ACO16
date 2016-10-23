package week2.home.cat;

import java.util.ArrayList;

/**
 * Created by Alexander on 21.10.2016.
 */
public class Cat {
    private String name;
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat(String name) {
        this.name = name;
        cats.add(this);

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
    public void printCats(){
        System.out.println(cats.toString());
    }

}
