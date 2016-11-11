package library.library.model;

import library.library.enums.Genre;

/**
 * Created by Alexander on 27.10.2016.
 */
public class Encyclopedia extends PeriodicalIssue {

    public Encyclopedia(String name, int year, String author, Genre genre) {
        super(name, year, author, genre);
    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                super.toString() +
                '}';
    }
}
