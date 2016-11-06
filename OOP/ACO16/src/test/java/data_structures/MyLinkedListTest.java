package data_structures;

import data_structures.list.MyLinkedList;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

/**
 * Created by gorobec on 23.10.16.
 */
public class MyLinkedListTest extends ListTest {


    @Override
    public void init() {
        myList = new MyLinkedList();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
    }

    @Ignore
    @Test
    public void test_LL_iterator() {

        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");

        Iterator iterator = myList.iterator();

        for (int i = 0; i < myList.size(); i++) {

            assertSame(myList.get(i), iterator.next());
        }
    }
    @Ignore
    @Test
    public void test_LL_iterator_when_empty(){

        Iterator iterator = myList.iterator();

        assertFalse(iterator.hasNext());

    }


}
