package week1.homework.Interface.Task1;

/**
 * Created by Alexander on 15.10.2016.
 */
public abstract class Book implements Edition {
    public String name;
    public int page;
    public String kind;

    public abstract void price();

    public Book(String kind, String name, int page) {
        this.kind = kind;
        this.name = name;
        this.page = page;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page=" + page +
                ", kind='" + kind + '\'' +
                '}';
    }
}
