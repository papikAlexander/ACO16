package week3.day2.singelton;

/**
 * Created by Alexander on 23.10.2016.
 */
public class ThreadSafeSingeltonInsideIf {

    private static ThreadSafeSingeltonInsideIf instance;

    private ThreadSafeSingeltonInsideIf(){

    }

    public ThreadSafeSingeltonInsideIf getInsnace(){
        if (instance == null){
            synchronized (ThreadSafeSingeltonInsideIf.class){
                if (instance == null){
                    instance = new ThreadSafeSingeltonInsideIf();
                }
            }
        }
        return instance;
    }
}
