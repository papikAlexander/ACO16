package week5.day1.exeptions;

/**
 * Created by Alexander on 05.11.2016.
 */
public class MyRuntimeExeptions extends RuntimeException {

    public MyRuntimeExeptions() {
    }

    public MyRuntimeExeptions(String message) {
        super(message);
    }

}
