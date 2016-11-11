package library.library.config;

import library.library.dao.IssueDao;
import library.library.dao.ReaderDao;
import library.library.database.LibraryDB;

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
