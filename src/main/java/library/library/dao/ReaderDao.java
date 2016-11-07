package week2.day2.library.dao;

import week2.day2.library.model.Reader;
import week2.day2.library.database.LibraryDB;

import java.util.ArrayList;

/**
 * Created by Alexander on 22.10.2016.
 */
public class ReaderDao {

    private LibraryDB db;

    public ReaderDao(){
        db = LibraryDB.getLibraryDBInstance();
    }

    public boolean addReader(Reader reader){
        return db.addReader(reader);
    }

    public boolean deleteReader(String name, String surname){
        return db.deleteReader(new Reader(name, surname));
    }

    public Reader getReader(String name, String surname){
        return db.getReader(new Reader(name, surname));
    }

    public boolean findReader(String name, String surname){
        return db.findReader(new Reader(name, surname));
    }

    public ArrayList<Reader> printReaders(){
        return db.printReaders();
    }
}
