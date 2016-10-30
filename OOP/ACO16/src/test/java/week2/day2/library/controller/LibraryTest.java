package week2.day2.library.controller;

import org.junit.Before;
import org.junit.Test;
import week2.day2.library.dao.IssueDao;
import week2.day2.library.dao.ReaderDao;
import week2.day2.library.enums.Genre;
import week2.day2.library.exceptions.MoreThanMaxAmountOfPeriodicalIssuesException;
import week2.day2.library.model.PeriodicalIssue;
import week2.day2.library.model.Reader;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by gorobec on 30.10.16.
 */
public class LibraryTest {

    ReaderDao mockReaderDao;
    Library library;
    IssueDao mockIssueDao;
    Reader mockReader;
    PeriodicalIssue mockIssue;


    @Before
    public void init(){
        library = new Library("ArtCode");

       mockReaderDao = mock(ReaderDao.class);
       mockIssueDao = mock(IssueDao.class);
       mockReader = mock(Reader.class);
        mockIssue = mock(PeriodicalIssue.class);
       library.setReaderDao(mockReaderDao);
       library.setIssueDao(mockIssueDao);

    }


    @Test
    public void tetst_give_issue_to_reader() throws MoreThanMaxAmountOfPeriodicalIssuesException {


        when(mockReaderDao.findReader("Serhij")).thenReturn(true);

        when(mockIssueDao.findIssue("Effective java", "Bloch", 2008, Genre.SCIENCE)).thenReturn(true);

        when(mockReaderDao.getReader("Serhij")).thenReturn(mockReader);

        when(mockIssueDao.getIssue("Effective java", "Bloch", 2008, Genre.SCIENCE)).thenReturn(mockIssue);

        when(mockReader.addPeriodicalIssue(mockIssue)).thenReturn(true);


        assertTrue(library.giveIssueToReader("Serhij", "Effective java", "Bloch", 2008, Genre.SCIENCE));

    }
    @Test
    public void tetst_give_issue_to_reader_when_reader_isnot_in_db() throws MoreThanMaxAmountOfPeriodicalIssuesException {


        when(mockReaderDao.findReader("Serhij")).thenReturn(false);


        assertFalse(library.giveIssueToReader("Serhij", "Effective java", "Bloch", 2008, Genre.SCIENCE));

    }
}
