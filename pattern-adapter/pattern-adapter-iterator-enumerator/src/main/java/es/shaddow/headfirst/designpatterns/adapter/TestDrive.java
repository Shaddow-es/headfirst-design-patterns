package es.shaddow.headfirst.designpatterns.adapter;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class TestDrive {

	public static void main(String args[]) {
		String elems[] = { "elem1", "elem2", "elem3" };
		Vector<String> v = new Vector<String>(Arrays.asList(elems));
		Enumeration<String> enumeration = v.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

		System.out.println("");

		Iterator<String> iterator = v.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
