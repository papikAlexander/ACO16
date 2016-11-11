package library.library.dao;

import library.library.model.Reader;
import library.library.database.LibraryDB;

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

    public boolean deleteReader(Reader reader){
        return db.deleteReader(reader);
    }

    public Reader getReader(Reader reader){
        return db.getReader(reader);
    }

    public boolean findReader(Reader reader){
        return db.findReader(reader);
    }

    public ArrayList<Reader> printReaders(){
        return db.printReaders();
    }
}
