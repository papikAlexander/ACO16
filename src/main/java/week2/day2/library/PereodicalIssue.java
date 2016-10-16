package week2.day2.library;

/**
 * Created by Alexander on 16.10.2016.
 */
public abstract class PereodicalIssue {
    private String year;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

}
