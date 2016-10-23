package week3.day2.singelton;

/**
 * Created by Alexander on 23.10.2016.
 */
public class ThreadSafeSingelton {

    private static ThreadSafeSingelton instance;

    private ThreadSafeSingelton(){

    }

    public synchronized ThreadSafeSingelton getInsnace(){
        if (instance == null){
            instance = new ThreadSafeSingelton();
        }
        return instance;
    }
}
