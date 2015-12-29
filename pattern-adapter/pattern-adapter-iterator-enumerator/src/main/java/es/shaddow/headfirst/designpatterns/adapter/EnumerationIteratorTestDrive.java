package es.shaddow.headfirst.designpatterns.adapter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class EnumerationIteratorTestDrive {

	public static void main(String args[]) {
		String elems[] = { "elem1", "elem2", "elem3" };
		Vector<String> v = new Vector<String>(Arrays.asList(elems));
		Iterator<?> iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
