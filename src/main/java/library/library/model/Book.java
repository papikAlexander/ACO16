package library.library.model;

import library.library.enums.Genre;

/**
 * Created by Alexander on 16.10.2016.
 */
public class Book extends PeriodicalIssue {

    public Book(String name, int year, String author, Genre genre) {
        super(name, year, author, genre);
    }

    @Override
    public String toString() {
        return "Book{" +
                super.toString() +
                '}';
    }
}
