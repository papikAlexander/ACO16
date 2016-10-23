package week3.day2.singelton;

/**
 * Created by Alexander on 23.10.2016.
 */
public class Singeltone {

    private static Singeltone instance = new Singeltone();

    private Singeltone(){

    }

    public static Singeltone getInstance(){
        return instance;
    }
}
