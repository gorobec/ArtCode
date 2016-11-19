package data_structures;

import data_structures.set.MyBinarySearchTree;

/**
 * Created by gorobec on 13.11.16.
 */
public class BSTCollectionTest extends CollectionTest {
    @Override
    public void setUp() {
        collection = new MyBinarySearchTree<>();
    }

}
