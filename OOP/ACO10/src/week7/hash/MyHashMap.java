package week7.hash;


import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K,V> {
    private static final int DEFAULT_CAPACITY = 16;
    Entry<K,V>[] table;
    private static final double LOAD_FACTOR = 0.75;
    private int capacity;
    private int boarder;

    public MyHashMap(int capacity) {
        this.capacity = capacity;
        this.table = (Entry<K,V>[])new Object[capacity];
        this.boarder = (int)(capacity * LOAD_FACTOR);
    }

    public MyHashMap() {
        this.table = (Entry<K,V>[])new Object[DEFAULT_CAPACITY];
        this.capacity = DEFAULT_CAPACITY;
        this.boarder = (int)(capacity * LOAD_FACTOR);


    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }


    private static class Entry<K,V> implements Map.Entry<K,V>{
        K key;
        V value;
        Map.Entry<K, V> next;

        public Entry(K key, V value, Map.Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Entry<?, ?> entry = (Entry<?, ?>) o;

            if (key != null ? !key.equals(entry.key) : entry.key != null) return false;
            if (value != null ? !value.equals(entry.value) : entry.value != null) return false;
            return !(next != null ? !next.equals(entry.next) : entry.next != null);

        }

        @Override
        public int hashCode() {
            int result = key != null ? key.hashCode() : 0;
            result = 31 * result + (value != null ? value.hashCode() : 0);
            result = 31 * result + (next != null ? next.hashCode() : 0);
            return result;
        }

        @Override
        public K getKey() {
            return null;
        }

        @Override
        public V getValue() {
            return null;
        }

        @Override
        public V setValue(V value) {
            return null;
        }

    }

}
