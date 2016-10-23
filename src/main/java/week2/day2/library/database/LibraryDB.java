package week2.day2.library.database;

import week2.day2.library.Library;
import week2.day2.library.PeriodicalIssue;
import week2.day2.library.Reader;

import java.util.ArrayList;

/**
 * Created by Alexander on 22.10.2016.
 */
public class LibraryDB {

    private static ArrayList<Reader> readers;
    private static ArrayList<PeriodicalIssue> issues;

    private static LibraryDB libraryDBInstance = new LibraryDB();

    private LibraryDB(){

    }

    public static LibraryDB getLibraryDBInstance(){
        if (libraryDBInstance == null){
            synchronized (LibraryDB.class){
                if (libraryDBInstance == null){
                    libraryDBInstance = new LibraryDB();
                }
            }
        }
        return libraryDBInstance;
    }

    public boolean addReader(Reader reader){
        return false;
    }
    public boolean deleteReader(Reader reader){
        return false;
    }
    public Reader getReader(Reader reader){
        return null;
    }
    public boolean findReader(Reader reader){
        return false;
    }

    public boolean addIssue(PeriodicalIssue issue){
        return false;
    }
    public boolean deleteIssue(PeriodicalIssue issue){
        return false;
    }
    public PeriodicalIssue getIssue(PeriodicalIssue issue){
        return null;
    }
    public boolean findIssue(PeriodicalIssue issue){
        return false;
    }
}
