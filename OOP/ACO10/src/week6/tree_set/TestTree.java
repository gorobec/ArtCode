package week6.tree_set;

import java.util.Iterator;

public class TestTree {
    public static void main(String[] args) {

       BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(8);
        tree.add(6);
        tree.add(13);
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(15);
        tree.remove(8);
        tree.add(19);
        tree.add(25);
        tree.add(16);
        tree.add(17);
        tree.add(2);
        tree.add(3);
        tree.add(4);
//        tree.show();
        System.out.println(tree.remove(25));
        Iterator<Integer> iterator = tree.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            System.out.print(i + " ");
        }
//        tree.clear();
        for (Integer integer : tree) {
            System.out.print(integer + " ");
        }
    }
}
