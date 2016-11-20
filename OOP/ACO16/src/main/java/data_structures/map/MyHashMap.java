package data_structures.map;

/**
 * Created by gorobec on 20.11.16.
 */

public class MyHashMap<K, V> implements MyMap<K,V> {

    private final static double DEFAULT_LOAD_FACTOR = 0.75;
    private final static int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[]table;
    private int capacity;
    private double loadFactor;
    private int threshold;
    private int size;

    @SuppressWarnings("unchecked")
    public MyHashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);

    }
    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity) {
        this(capacity, DEFAULT_LOAD_FACTOR);

    }
    @SuppressWarnings("unchecked")
    public MyHashMap(int capacity, double loadFactor) {
        this.capacity = capacity;
        this.loadFactor = loadFactor;
        this.table = (Entry<K, V>[]) new Entry[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {

        if(key == null){
//            todo
        }

        if(threshold <= size){
            rehash();
        }

        int position = findPosition(key);

        if (table[position] == null){
            table[position] = new Entry<>(key, value);
        } else {
            Entry<K,V> pointer = table[position];
            Entry<K,V> pointerPrevious;

            do {
                if (pointer.key.equals(key)){
                    V oldValue= pointer.value;
                    pointer.value = value;
                    return oldValue;
                }
                pointerPrevious = pointer;
                pointer = pointer.next;
            }
            while (pointer != null);

            pointerPrevious.next = new Entry<>(key, value);
        }
        size++;
        return null;
    }

    private void rehash() {
//        // TODO: 20.11.16
    }

    private int findPosition(K key) {
        return key.hashCode() % table.length;
    }

    @Override
    public V get(K key) {

        if(key == null) return null;
        int position = findPosition(key);

        if (table[position] != null){
            Entry<K,V> pointer = table[position];

            while (pointer != null){
                if (pointer.key.equals(key)){
                    return pointer.value;
                }
                pointer = pointer.next;
            }
        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public V remove(K key) {

        int position = findPosition(key);

        if (table[position] != null) {
            Entry<K,V> pointer = table[position];
            Entry<K,V> pointerPrevious = null;

            while (pointer != null){
                if (pointer.key.equals(key) ){
                    V value = pointer.value;

                    if(pointerPrevious != null){
                        pointerPrevious.next = pointer.next;
                    }
                    size--;
                    return value;
                }
                pointerPrevious = pointer;
                pointer = pointer.next;
            }
        }
        return null;
    }

    @Override
    public boolean remove(K key, V value) {
        int position = findPosition(key);


        if (table[position] != null) {
            Entry<K,V> pointer = table[position];
            Entry<K,V> pointerPrevious = null;

            Entry<K,V> forSearch = new Entry<>(key, value);
            while (pointer != null){
                if (pointer.equals(forSearch) ){

                    if(pointerPrevious != null){
                        pointerPrevious.next = pointer.next;
                    }
                    size--;
                    return true;
                }
                pointerPrevious = pointer;
                pointer = pointer.next;
            }
        }
        return false;
    }

    private static class Entry<K, V> {

        K key;
        V value;

        Entry<K,V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(K key, V value, Entry<K, V> next) {
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
            return value != null ? value.equals(entry.value) : entry.value == null;

        }

    }
}
