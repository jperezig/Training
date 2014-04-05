package org.ninit.training.hash;

public class ArraySet<T> {

	private Object[] set;

	public ArraySet(int size) {
		set = new Object[size];
	}

	public boolean add(T t) {
		t.hashCode();
		set[0] = t;
		return false;
	}
}
