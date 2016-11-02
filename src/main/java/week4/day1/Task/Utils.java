package week4.day1.Task;

import java.util.List;

/**
 * Created by Alexander on 29.10.2016.
 */
public class Utils {

    public static <T extends Product> boolean find(List<T> list, T p){
        return false;
    }

    public static void copy(List<? extends Product> src, List<? super Product> dest){
        for (Product product : src) {
            dest.add(product);
        }
    }
}
