package week3.day2.singelton;

/**
 * Created by Alexander on 23.10.2016.
 */
public class SingletonHelper {

    private SingletonHelper(){

    }
    private static class  Helper{
        private static final SingletonHelper instance = new SingletonHelper();
    }

    public static  SingletonHelper getInstance(){
        return Helper.instance;
    }
}
