package week2.day2.library.model;

import week2.day2.library.enums.Access;
import week2.day2.library.enums.Genre;

/**
 * Created by Alexander on 16.10.2016.
 */
public class PeriodicalIssue {

    private String name;
    private int year;
    private String author;
    private Genre genre;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    private Access access;

    public PeriodicalIssue(String name, int year, String author, Genre genre) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.genre = genre;
        access = Access.FREE;
    }

    @Override
    public String toString() {
        return "PeriodicalIssue{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                ", genre=" + genre +
                " access" + access + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof PeriodicalIssue)) return false;

        PeriodicalIssue that = (PeriodicalIssue) o;

        if (year != that.year) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        return genre == that.genre;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (genre != null ? genre.hashCode() : 0);
        return result;
    }

    public final boolean accessFree(){
        access = Access.FREE;
        return true;
    }

    public final boolean accessBusy(){
        access = Access.BUSY;
        return true;
    }
    public final String info(){
        return this.name + ", " + this.year + ", " + this.author + ", " + this.genre;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }
}
