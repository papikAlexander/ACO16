package week2.day2.library.dao;

import week2.day2.library.Reader;
import week2.day2.library.database.LibraryDB;

/**
 * Created by Alexander on 22.10.2016.
 */
public class ReaderDao {
    private LibraryDB db;

    public ReaderDao(){
        db = LibraryDB.getLibraryDBInstance();
    }

    public boolean findUser(String name, String surname){
        return db.findReader(new Reader(name, surname, true));
    }
}
