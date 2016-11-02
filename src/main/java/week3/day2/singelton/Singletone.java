package week3.day2.singelton;

/**
 * Created by Alexander on 23.10.2016.
 */
public class Singletone {

    private static Singletone instance = new Singletone();

    private Singletone(){

    }

    public static Singletone getInstance(){
        return instance;
    }
}
