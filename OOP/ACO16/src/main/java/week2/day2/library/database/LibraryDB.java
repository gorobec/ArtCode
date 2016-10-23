package week2.day2.library.database;

import week2.day2.library.controller.Library;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gorobec on 22.10.16.
 */
public class LibraryDB {

    private static List<Reader> readers;
    private static List<PeriodicalIssue> issues;

    private static LibraryDB libraryDBInstance;

    private LibraryDB(){

    }

    public static LibraryDB getInstance(){
        if(libraryDBInstance == null){
            synchronized (LibraryDB.class){
                if(libraryDBInstance == null){
                    libraryDBInstance = new LibraryDB();
                }
            }
        }
        return libraryDBInstance;
    }




    public boolean addReader(Reader reader){
        return false;
    }

    public boolean addIssue(PeriodicalIssue issue){
        return false;
    }


    public boolean deleteReader(Reader reader){
        return false;
    }

    public boolean deleteIssue(PeriodicalIssue issue){
        return false;
    }

    public Reader getReader(Reader reader){
        return null;
    }

    public PeriodicalIssue getIssue(PeriodicalIssue issue){
        return null;
    }

    public boolean findReader(Reader reader){
        return false;
    }

    public boolean findIssue(PeriodicalIssue issue){
        return false;
    }
}
