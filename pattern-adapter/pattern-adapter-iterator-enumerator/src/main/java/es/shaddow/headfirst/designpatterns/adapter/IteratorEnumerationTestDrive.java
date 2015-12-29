package es.shaddow.headfirst.designpatterns.adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;

public class IteratorEnumerationTestDrive {

	public static void main(String args[]) {
		String elems[] = { "elem1", "elem2", "elem3" };
		ArrayList<String> l = new ArrayList<String>(Arrays.asList(elems));
		Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
