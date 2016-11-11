package library.library.dao;

import library.library.database.LibraryDB;
import library.library.enums.Genre;
import library.library.model.PeriodicalIssue;

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

    public boolean deleteIssue(PeriodicalIssue issue){
        return db.deleteIssue(issue);
    }

    public PeriodicalIssue getIssue(PeriodicalIssue issue){
        return db.getIssue(issue);
    }

    public boolean findIssue(PeriodicalIssue issue){
        return db.findIssue(issue);
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
