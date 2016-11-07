package week2.day2.library.dao;

import week2.day2.library.database.LibraryDB;
import week2.day2.library.enums.Genre;
import week2.day2.library.model.Book;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;

/**
 * Created by Alexander on 27.10.2016.
 */
public class IssueDao {

    private LibraryDB db;

    public IssueDao(){
        db = LibraryDB.getLibraryDBInstance();
    }

    public boolean addIssue(PeriodicalIssue issue){
        return db.addIssue(issue);
    }

    public boolean deleteIssue(String name, int year, String author, Genre genre){
        return db.deleteIssue(new PeriodicalIssue(name, year, author, genre));
    }

    public PeriodicalIssue getIssue(String name, int year, String author, Genre genre){
        return db.getIssue(new PeriodicalIssue(name, year, author, genre));
    }

    public boolean findIssue(String name, int year, String author, Genre genre){
        return db.findIssue(new PeriodicalIssue(name, year, author, genre));
    }

    public boolean findIssueByName(String name){
        return db.findIssue(new PeriodicalIssue(name, 0, null, null));
    }

    public ArrayList<PeriodicalIssue> printIssueFree(){
        return db.printIssueFree();
    }

    public ArrayList<PeriodicalIssue> printIssueBusy(){
        return db.printIssueBusy();
    }

    public ArrayList<PeriodicalIssue> copyArrayListIssue(){
        return db.copyArrayListIssue();
    }
}
