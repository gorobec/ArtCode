package week7;

import data_structures.binary_search_tree.BinarySearchTree;

/**
 * Created by gorobec on 10.07.16.
 */
public class TreeDeepShow {
    public static void main(String[] args) {
        BinarySearchTree<String> tree = new BinarySearchTree<>();
        tree.add("S");
        tree.add("G");
        tree.add("M");
        tree.add("A");
        tree.add("R");
        tree.add("U");
        tree.add("B");
        tree.add("I");


        tree.showTree();
    }
}
