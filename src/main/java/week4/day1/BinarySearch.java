package week4.day1;

import java.util.List;

/**
 * Created by Alexander on 29.10.2016.
 */
public class BinarySearch {

    public static boolean binarySearch(List list, Comparable o){
        if (o == null || list == null || list.size() < 1) return false;

        int start = 0;
        int end = list.size() - 1;
        int middle = (end - start) / 2;

        if (o.compareTo(list.get(start)) < 0 ||o.compareTo(list.get(end)) > 0) return false;

        do {
            int result = o.compareTo(list.get(middle));

            if (result > 0) {

                start = middle + 1;
            } else if (result == 0) {
                return true;
            } else {
                end = middle - 1;

            }
            middle = start + (end - start)/2;

            if (middle == start & middle == end) return true;
        } while (start != end);
        return false;
    }
}
