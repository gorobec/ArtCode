package data_structures;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by gorobec on 13.11.16.
 */
public abstract class CollectionTest {
    protected Collection<String> collection;

//   create empty data structure
    @Before
    public abstract void setUp();

    @After
    public void tearDown(){
        collection = null;
    }

    @Test
    public void test_size_when_empty(){
        assertEquals(0, collection.size());
    }
    @Test
    public void test_isEmpty(){
        assertTrue(collection.isEmpty());
    }
    @Test
    public void test_isEmpty_after_adding(){
        assertTrue(collection.add("1"));
        assertFalse(collection.isEmpty());
    }

    @Test
    public void test_first_add(){
        assertTrue(collection.add("1"));
        assertEquals(1, collection.size());
    }

    @Test
    public void test_contains_when_true(){
        assertTrue(collection.add("1"));
        assertTrue(collection.add("2"));
        assertTrue(collection.add("3"));
        assertTrue(collection.contains("3"));
    }
    @Test
    public void test_add_few(){
        assertTrue(collection.add("1"));
        assertTrue(collection.add("2"));
        assertTrue(collection.add("3"));
        assertEquals(3, collection.size());
    }
    @Test
    public void test_contains_when_false(){
        assertFalse(collection.contains("3"));
    }
}
