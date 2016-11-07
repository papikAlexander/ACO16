package week2.day2.library.config;

import week2.day2.library.dao.IssueDao;
import week2.day2.library.dao.ReaderDao;
import week2.day2.library.database.LibraryDB;

/**
 * Created by Alexander on 23.10.2016.
 */
public class ApplicationContext {

    private LibraryDB libraryDB = LibraryDB.getLibraryDBInstance();
    private ReaderDao readerDao = new ReaderDao();
    private IssueDao issueDao = new IssueDao();

    private static ApplicationContext instance;

    public static ApplicationContext getInstance(){

        if(instance == null){
            synchronized (ApplicationContext.class){
                if (instance == null){
                    instance = new ApplicationContext();
                }
            }
        }
        return instance;
    }

    public LibraryDB getLibraryDB() {
        return libraryDB;
    }

    public ReaderDao getReaderDao() {
        return readerDao;
    }

    public IssueDao getIssueDao() {
        return issueDao;
    }
}
