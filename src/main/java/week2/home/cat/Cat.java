package week2.home.cat;

import week2.day2.MyArrayList;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Alexander on 21.10.2016.
 */
public class Cat {
    private String name;
    public static ArrayList<Cat> cats = new ArrayList();

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        this.name = name;
        cats.add(this);

    }
    public void printCats(){
        System.out.println(cats.toString());
    }

}
