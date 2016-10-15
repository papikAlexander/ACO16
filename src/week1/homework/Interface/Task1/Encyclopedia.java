package week1.homework.Interface.Task1;

/**
 * Created by Alexander on 15.10.2016.
 */
public class Encyclopedia extends  Book{

    public Encyclopedia(String name, int page) {
        super("encyclopedia", name, page);
    }


    @Override
    public void author() {
        System.out.printf("Book \"%s\" - author Ivanov", name);
        System.out.println();

    }

    @Override
    public void edition() {
        System.out.println("Release date 20.10.2016");

    }

    @Override
    public void price() {
        System.out.println("Price - 100$");

    }
}
