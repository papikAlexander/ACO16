package week2.day2.library.database;

import week2.day2.library.enums.Access;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;

/**
 * Created by Alexander on 22.10.2016.
 */
public class LibraryDB {

    private static ArrayList<Reader> readers;
    private static ArrayList<PeriodicalIssue> issues;

    private  ArrayList<Reader> showReaders;
    private  ArrayList<PeriodicalIssue> copyIssue;

    private static LibraryDB libraryDBInstance;

    private LibraryDB(){
        readers = new ArrayList<>();
        issues = new ArrayList<>();
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

    private int indexOfReader(Reader reader){
        for (int index = 0; index < readers.size(); index++) {
            if(reader.equals(readers.get(index))) {
                return index;
            }
        }
        return -1;
    }

    public ArrayList<PeriodicalIssue> copyArrayListIssue(){
        copyIssue = new ArrayList<>();
        for (int i = 0; i < issues.size(); i++) {
            copyIssue.add(issues.get(i));
        }
        return copyIssue;
    }

    public boolean addReader(Reader reader){

        if (indexOfReader(reader) >= 0) return false;

        readers.add(reader);
        return true;
    }

    public boolean deleteReader(Reader reader){

        int position = indexOfReader(reader);

        if (position < 0) return false;

        readers.remove(position);
        System.out.println("0");
        return true;
    }

    public Reader getReader(Reader reader){

        int position = indexOfReader(reader);
        if (position >= 0) return readers.get(position);

        return null;
    }
    public boolean findReader(Reader reader){
        if (indexOfReader(reader) >= 0) return true;
        return false;
    }

    private int indexOfIssue(PeriodicalIssue issue){
        for (int index = 0; index < issues.size(); index++) {
            if(issue.equals(issues.get(index))) {
                return index;
            }
        }
        return -1;
    }

    public boolean addIssue(PeriodicalIssue issue){

        if (indexOfIssue(issue) >= 0) return false;

        issues.add(issue);
        return true;
    }

    public boolean deleteIssue(PeriodicalIssue issue){

        int position = indexOfIssue(issue);

        if (position < 0) return false;

        issues.remove(position);
        return true;
    }

    public PeriodicalIssue getIssue(PeriodicalIssue issue){

        int position = indexOfIssue(issue);
        if (position >= 0) return issues.get(position);

        return null;
    }
    public boolean findIssue(PeriodicalIssue issue){
        if (indexOfIssue(issue) >= 0) return true;
        return false;
    }

    public ArrayList<PeriodicalIssue> printIssueFree(){
        copyIssue = new ArrayList<>();
        for (int i = 0; i < issues.size(); i++) {

            if (issues.get(i).getAccess() == Access.BUSY) continue;

            copyIssue.add(issues.get(i));
        }
        return copyIssue;
    }

    public ArrayList<PeriodicalIssue> printIssueBusy(){
        copyIssue = new ArrayList<>();
        for (int i = 0; i < issues.size(); i++) {

            if (issues.get(i).getAccess() == Access.FREE) continue;

            copyIssue.add(issues.get(i));
        }
        return copyIssue;
    }

    public ArrayList<Reader> printReaders(){
        showReaders = new ArrayList<>();
        for (int i = 0; i < readers.size(); i++) {
            showReaders.add(readers.get(i));
        }
        return showReaders;
    }

}
