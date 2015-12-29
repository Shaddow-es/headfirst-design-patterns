package es.shaddow.headfirst.designpatterns.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
	Enumeration<?> enumeration;

	public EnumerationIterator(Enumeration<?> enumeration) {
		super();
		this.enumeration = enumeration;
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public Object next() {
		return enumeration.nextElement();
	}

	public void remove() {
		throw new UnsupportedOperationException("remove");
	}
}
