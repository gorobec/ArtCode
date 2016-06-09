package week6.tree_set;




import java.util.Iterator;

public class BinarySearchTree<T extends Comparable<? super T>> implements ITree<T> {
    private Node<T> root;
    private int size;

    @Override
    public boolean add(T obj) {
        if(root == null) {
            root = new Node<>(obj);
            size++;
            return true;
        }
        Node<T> iter = root;
        while(true){
            int compare = obj.compareTo(iter.value);
            if(compare < 0){
                if(iter.leftChild == null){
                    iter.leftChild = new Node<>(obj, iter);
                    size++;
                    return true;
                } else{
                    iter = iter.leftChild;
                }
            }else if(compare > 0){
                if(iter.rightChild == null){
                    iter.rightChild = new Node<>(obj, iter);
                    size++;
                    return true;
                } else{
                    iter = iter.rightChild;
                }
            } else{
                return false;
            }
        }
    }

    @Override
    public boolean remove(T t) {
        Node<T> delete = binarySearch(t);
        if(delete == null){
            return false;
        }
        Node<T> deleteParent = delete.parent;
        if(delete.leftChild == null && delete.rightChild == null){
            if(delete == root){
                root = null;
            } else if(isALeftChild(delete, delete.parent)){
            deleteParent.leftChild = null;
            } else {
                deleteParent.rightChild = null;
            }
        } else if(delete.leftChild == null || delete.rightChild == null){
            Node<T> child = delete.leftChild == null ? delete.rightChild : delete.leftChild;
            child.parent = deleteParent;
            if(delete == root) {
                root = child;
            } else if (isALeftChild(delete, deleteParent)){
                deleteParent.leftChild = child;
            } else {
                deleteParent.rightChild = child;
            }
        } else{
            Node<T> receiver = goToLeftLeaf(delete.rightChild);

            if(delete == receiver.parent){
                receiver.parent.rightChild = receiver.rightChild;
            } else {
                receiver.parent.leftChild = receiver.rightChild;
                if(receiver.rightChild != null) {
                    receiver.rightChild.parent = receiver.parent;
                }
            }

            if(delete == root) {
                root = receiver;
            } else {
                if(delete == delete.parent.leftChild){
                    delete.parent.leftChild = receiver;
                } else {
                    delete.parent.rightChild = receiver;
                }
            }
            receiver.parent = deleteParent;
            receiver.leftChild = delete.leftChild;
            receiver.rightChild = delete.rightChild;
            delete.leftChild.parent = receiver;
//            if(delete.rightChild != null) {
                delete.rightChild.parent = receiver;
//            }
        }
        size--;
        return true;
    }

    private boolean isALeftChild(Node<T> delete, Node<T> deleteParent) {
        return delete == deleteParent.leftChild;
    }

    @Override
    public boolean contains(T t) {

        Node<T> search = binarySearch(t);
        return search != null;
    }

    private Node<T> binarySearch(T obj) {
        Node<T> iter = root;
        while(iter != null){
            int compare = obj.compareTo(iter.value);
            if(compare < 0) {
                iter = iter.leftChild;
            }else if(compare > 0){
                iter = iter.rightChild;
            } else{
                break;
            }
        }
        return iter;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T findMin() {
        if(root == null){
            return null;
        }
        Node<T> leftLeaf = goToLeftLeaf(root);
        return leftLeaf.value;
    }

    private Node<T> goToLeftLeaf(Node<T> root) {
        if(size == 0){
            return root;
        }
        Node<T> iter = root;
        while (iter.leftChild != null){
            iter = iter.leftChild;
        }
        return iter;
    }

    @Override
    public T findMax() {
        if(root == null){
            return null;
        }
        Node<T> rightLeaf = goToRightLeaf(root);
        return rightLeaf.value;

    }

    private Node<T> goToRightLeaf(Node<T> root) {
        Node<T> iter = root;
        while (iter.rightChild != null){
            iter = iter.rightChild;
        }
        return iter;
    }

    @Override
    public void clear() {
        size = 0;
        root = null;
    }

    public void show(){
        if(size == 0){
            throw new TreeIsEmptyException();
        }
        showTree(root);
        System.out.println();
    }

    private void showTree(Node<T> root){
        if(root.leftChild == null && root.rightChild == null){
            System.out.print(root.value + " ");
            return;
        }
        if(root.leftChild != null){
            showTree(root.leftChild);
        }
        if(root.rightChild != null){
            System.out.print(root.value + " ");
            showTree(root.rightChild);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new TreeIterator(goToLeftLeaf(root));
    }

    private class Node<E> {
         private E value;
         Node<E> parent;
         Node<E> leftChild ;
         Node<E> rightChild;

        public Node(E value, Node<E> parent) {
            this.value = value;
            this.parent = parent;
        }

        public Node(E value) {
            this.value = value;
        }


        /*public Node(Node<E> parent) {
            this.parent = parent;
        }*/
    }

    private class TreeIterator implements Iterator<T> {


        Node<T> iterator;
        int way;

        public TreeIterator(Node<T> start) {
            if (root != null) {
                this.iterator = start;
            }
        }


        @Override
        public boolean hasNext() {
            return !isLastNode();
        }

        @Override
        public T next() {
            T result = iterator.value;
            if(iterator.rightChild != null){
                iterator = BinarySearchTree.this.goToLeftLeaf(iterator.rightChild);
            } else if (iterator.parent != null && iterator.parent.leftChild == iterator){
                iterator = iterator.parent;
            } else if(!isLastNode()){
                while (iterator != iterator.parent.leftChild){
                    iterator = iterator.parent;
                }
                iterator = iterator.parent;
            }
            way++;
            return result;
        }

        private boolean isLastNode() {
            return size - way == 1;
        }
    }
}

