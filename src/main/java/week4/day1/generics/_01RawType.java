package week4.day1.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 29.10.2016.
 */
public class _01RawType {
    public static void main(String[] args) {
        List rawType = new ArrayList();
        List<String> list = new ArrayList<>();

        rawType.add(1);
        rawType.add("1");

        String o = (String)rawType.get(0);
        list.add("1");
    }
}
