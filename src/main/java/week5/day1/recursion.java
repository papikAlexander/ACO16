package week5.day1;

/**
 * Created by Alexander on 05.11.2016.
 */
public class recursion {
    public static void main(String[] args) {
       // f(1);
        System.out.println(count8(8818));
    }

    private static void f(int i) {
        if (i > 10) return;
        System.out.println(i);
        f(i + 1);
        System.out.println(i);
    }

    public static int count8(int n){
        if(n == 0) return 0;
        if (n % 10 == 8) {
            if (n % 100 == 88)
                return count8(n / 10) + 2;
            return count8((n / 10) + 1);
        } else {
            return count8(n / 10);

        }
    }
}
