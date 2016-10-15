package week1.homework.Interface.Task1;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Directory  extends Book{
    public Directory( String name, int page) {
        super("directory", name, page);
    }

    @Override
    public void author() {
        System.out.printf("Book \"%s\" - author Petrov", name);
        System.out.println();

    }

    @Override
    public void edition() {
        System.out.println("Release date: 15.10.2016");

    }

    @Override
    public void price() {
        System.out.println("Price - 1000$");

    }
}
