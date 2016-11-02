package week4.day1.generics;

import java.util.Collection;
import java.util.List;

/**
 * Created by Alexander on 29.10.2016.
 */
public class _02LifecycleOfGenerics<T> {

    public void show(Collection<T> collection){
        for (T t : collection){
            System.out.println(t);
        }
    }

    public  void show(List<Integer> list){
        for (Integer t : list){
            System.out.println(t);
        }
    }
}
