package week2.day2.library;

import week2.day2.library.conroller.Library;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.Book;
import week2.day2.library.model.Encyclopedia;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

/**
 * Created by Alexander on 22.10.2016.
 */
public class Run {
    public static void main(String[] args) {

        PeriodicalIssue book = new Book("Idiot", 1896, "Dostoevskij", Genre.NOVEL);
        PeriodicalIssue book1 = new Book("Anna Karenina", 1856, "Lev Tolstoy", Genre.DRAMA);
        PeriodicalIssue book2 = new Book("Annaa Karenina", 1856, "Lev Tolstoy", Genre.DRAMA);
        PeriodicalIssue encyclopedia = new Encyclopedia("Earth", 2000, "Pet", Genre.SCIENCE);
        Reader reader = new Reader("Alex", "Smith");
        Reader reader1 = new Reader("Peter", "Smith");
        Library library = new Library("Vernadskogo");
        library.addReader(reader1);
        library.addReader(reader);
        library.addReader(reader);


        library.addIssue(book);
        library.addIssue(encyclopedia);
        library.addIssue(book2);
        library.addIssue(book1);

        library.printIssueFree();

        library.printReaders();
        library.giveIssueToReader(book, reader);
        library.giveIssueToReader(book1, reader);
        library.giveIssueToReader(encyclopedia, reader);
        library.giveIssueToReader(book2, reader);
        library.printReaders();
        /*library.inBlackList(reader);
       // library.inBlackList(reader1);
        library.printReaders();
        library.asBlackList(reader);
        library.printReaders();*/
        //library.printIssue();
        System.out.println("*");
        library.showIssueInReader(reader);

        System.out.println("Readers");
        library.printReaders();
        System.out.println("Issue free");
        library.printIssueFree();
        System.out.println("Issue busy");
        library.printIssueBusy();

        System.out.println("++++++++");
        library.showIssueByAuthor("Lev Tolstoy");

        System.out.println("++++++++");
        library.showIssueByYear(1856);



    }
}
