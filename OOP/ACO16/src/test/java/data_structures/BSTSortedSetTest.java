package data_structures;

import data_structures.set.MyBinarySearchTree;

/**
 * Created by gorobec on 13.11.16.
 */
public class BSTSortedSetTest extends SortedSetTest {
    @Override
    public void setUp() {
        set = new MyBinarySearchTree<>();
    }
}
