package data_structures.map;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.Null;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by gorobec on 20.11.16.
 */
public class TestMap {

    MyMap<Integer, String> map;

    @Before
    public void setUp(){
        map = new MyHashMap<>();
    }

    @Test
    public void test_put_first(){
        assertEquals(0, map.size());
        assertNull(map.put(1, "one"));
        assertEquals(1, map.size());
    }

    @Test
    public void test_put_same_key(){
        assertNull(map.put(1, "one"));
        assertEquals("one", map.put(1, "two"));
        assertEquals(1, map.size());
    }
    @Test
    public void test_put_sameHash_key(){
        assertNull(map.put(16, "one"));
        assertNull(map.put(32, "one"));
        assertEquals(2, map.size());
    }

    @Test
    public void test_put_few_keys(){
        assertNull(map.put(1, "one"));
        assertNull(map.put(2, "two"));
        assertNull(map.put(3, "three"));
        assertNull(map.put(4, "four"));
        assertEquals(4, map.size());
    }
    @Test
    public void test_get_when_true(){
        assertNull(map.put(1, "one"));
        assertEquals("one",map.get(1));
        assertEquals(1, map.size());

    }
    @Test
    public void test_get_when_false(){
        assertEquals(null, map.get(1));
        assertEquals(0, map.size());

    }

    @Test
    public void test_get_when_key_null(){
        assertNull(map.get(null));
    }

    @Test
    public void test_contains_when_true(){
        assertNull(map.put(1, "one"));
        assertTrue(map.containsKey(1));
    }

    @Test
    public void test_contains_when_false(){
        assertNull(map.put(1, "one"));
        assertFalse(map.containsKey(2));
    }

    @Test
    public void test_remove_key_when_exist(){
        assertNull(map.put(1, "one"));
        assertEquals(1, map.size());
        assertEquals("one",map.remove(1));
        assertEquals(0, map.size());
    }

    @Test
    public void test_remove_key_when_doesnt_exist(){
        assertNull(map.put(1, "one"));
        assertEquals(1, map.size());
        assertNull(map.remove(2));
        assertEquals(1, map.size());
    }

    @Test
    public void test_remove_when_exist(){
        assertNull(map.put(1, "one"));
        assertEquals(1, map.size());
        assertTrue(map.remove(1, "one"));
        assertEquals(0, map.size());
    }

    @Test
    public void test_remove_when_doesnt_exist(){
        assertNull(map.put(1, "one"));
        assertEquals(1, map.size());
        assertFalse(map.remove(1, "two"));
        assertEquals(1, map.size());
    }

}
