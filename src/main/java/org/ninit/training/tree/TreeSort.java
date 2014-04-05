package org.ninit.training.tree;

import java.util.List;

import org.ninit.training.utils.Utils;

public class TreeSort<T extends Comparable<T>> {

    private BinaryTree<T> tree;

    private void insert(int d, Node<T> parent, Node<T> node, T value) {
        if (node == null) {
            if (d == 1) {
                parent.addRight(value);
            } else {
                parent.addLeft(value);
            }
        } else {
            int compare = node.getValue().compareTo(value);
            if (compare < 0) {
                insert(1, node, node.getRight(), value);
            } else {
                insert(-1, node, node.getLeft(), value);
            }
        }
    }

    public void insert(T value) {
        if (tree == null) {
            tree = new BinaryTree<T>(value);
        } else {
            insert(1, null, tree.getRoot(), value);
        }
    }

    public List<T> sort() {
        List<T> result = tree.inOrder();
        return result;
    }

    public static void main(String arg[]) {
        TreeSort<Integer> tree = new TreeSort<Integer>();
        int[] numbers = Utils.getRandom(50);
        for (Integer i : numbers) {
            tree.insert(i);
        }
        System.out.println(tree.sort());
    }
}
