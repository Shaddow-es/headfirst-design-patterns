package es.shaddow.headfirst.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {
	Iterator<?> iterator;

	public IteratorEnumeration(Iterator<?> iterator) {
		super();
		this.iterator = iterator;
	}

	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	public Object nextElement() {
		return iterator.next();
	}
}
