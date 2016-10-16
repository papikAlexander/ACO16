package week2.home.interfaces;

import java.nio.channels.Pipe;
import java.util.logging.SocketHandler;

/**
 * Created by Alexander on 14.10.2016.
 */
public class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("I can swim, I'm fish");
    }
}
