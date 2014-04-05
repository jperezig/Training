package org.ninit.training.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {

	private Node<T> root;

	public BinaryTree(T value) {
		this.root = new Node<T>(value);
	}

	public Node<T> getRoot() {
		return root;
	}

	public List<T> preOrder() {
		return preOrder(root, new ArrayList<T>());
	}

	private List<T> preOrder(Node<T> node, List<T> list) {
		if (node != null) {
			list.add(node.getValue());
			preOrder(node.getLeft(), list);
			preOrder(node.getRight(), list);
		}

		return list;
	}

	public List<T> inOrder() {
		return inOrder(root, new ArrayList<T>());
	}

	private List<T> inOrder(Node<T> node, List<T> list) {
		if (node != null) {
			inOrder(node.getLeft(), list);
			list.add(node.getValue());
			inOrder(node.getRight(), list);

		}

		return list;
	}

	public List<T> postOrder() {
		return postOrder(root, new ArrayList<T>());
	}

	private List<T> postOrder(Node<T> node, List<T> list) {
		if (node != null) {
			postOrder(node.getLeft(), list);
			postOrder(node.getRight(), list);
			list.add(node.getValue());

		}

		return list;
	}

	public List<T> levelOrder() {
		List<Node<T>> nodes = new ArrayList<Node<T>>();
		nodes.add(root);
		return levelOrder(nodes, new ArrayList<T>());
	}

	private List<T> levelOrder(List<Node<T>> nodes, List<T> list) {
		while (nodes.size() > 0) {
			Node<T> node = nodes.remove(0);
			list.add(node.getValue());
			if (node.getLeft() != null) {
				nodes.add(node.getLeft());
			}
			if (node.getRight() != null) {
				nodes.add(node.getRight());
			}
		}
		return list;
	}

	public static void main(String args[]) {
		BinaryTree<Character> tree = new BinaryTree<Character>('F');

		tree.getRoot().addLeft('B').addLeft('A').getParent().addRight('D')
				.addLeft('C').getParent().addRight('E');
		tree.getRoot().addRight('G').addRight('I').addLeft('H');

		// Pre-order: F, B, A, D, C, E, G, I, H
		System.out.println("Pre-order:   "+tree.preOrder());

		// Post-Order: A, C, E, D, B, H, I, G, F
		System.out.println("Post-order:  "+tree.postOrder());

		// In-order: A, B, C, D, E, F, G, H, I
		System.out.println("In-order:    "+tree.inOrder());

		// Level-order: F, B, G, A, D, I, C, E, H
		System.out.println("Level-order: "+tree.levelOrder());
	}

}
