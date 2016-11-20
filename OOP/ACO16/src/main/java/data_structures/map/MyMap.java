package data_structures.map;

/**
 * Created by gorobec on 20.11.16.
 */
public interface MyMap<K, V> {
    int size();

    V put(K key, V value);

    V get(K key);

    boolean containsKey(K key);

    V remove(K key);

    boolean remove(K key, V value);
}
