package org.ninit.training.tree;

public class Node<T> {

	private T value;
	private Node<T> parent;
	private Node<T> right;
	private Node<T> left;

	public Node(T t) {
		value = t;
	}

	public Node(Node<T> parent, T t) {
		value = t;
		this.parent = parent;
	}

	public Node<T> getParent() {
		return parent;
	}

	public boolean hasParent() {
		return parent != null;
	}

	public T getValue() {
		return value;
	}

	public Node<T> getRight() {
		return this.right;
	}

	public Node<T> addRight(T t) {
		this.right = new Node<T>(this, t);
		return right;
	}

	public Node<T> getLeft() {
		return this.left;
	}

	public Node<T> addLeft(T t) {
		this.left = new Node<T>(this, t);
		return left;
	}
	
	@Override
	public String toString(){
		return (String)value;
	}

}
