package week2.home.interfaces;

/**
 * Created by Alexander on 14.10.2016.
 */
public class Ocean {
    public Swimmable swimmable;

    public Ocean(Swimmable swimmable){
        this.swimmable = swimmable;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "swimmable=" + swimmable +
                '}';
    }
}
