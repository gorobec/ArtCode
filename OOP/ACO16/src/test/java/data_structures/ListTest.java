package data_structures;

import org.junit.*;
import data_structures.list.MyList;

import static org.junit.Assert.*;

/**
 * Created by gorobec on 16.10.16.
 */
public abstract class ListTest {

    protected MyList myList;

    @Before
    public abstract void init();
    @After
    public void tearDown(){
        myList = null;

    }

    @Test
    public void testMyArrayListAdd(){
        System.out.println("Test1");

        boolean actual = myList.add("1");

        assertTrue(actual);
    }

    @Test
    public void testMyArrayListAddTwoElements(){
        System.out.println("Test2");


        myList.add("1");
        myList.add("2");

        assertEquals(2, myList.size());
        assertEquals("1", myList.get(0));
        assertEquals("2", myList.get(1));
    }
    @Test
    public void testMyArrayListSizeAfterAdd(){

        System.out.println("Test3");


        myList.add("1");


        assertEquals("Some description",1, myList.size());

    }



}
