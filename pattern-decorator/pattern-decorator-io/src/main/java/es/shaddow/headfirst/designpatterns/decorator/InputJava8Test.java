package es.shaddow.headfirst.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputJava8Test {

	public static void main(String[] args) {
		int c;

		try (InputStream is = new LowerCaseInputStream(new BufferedInputStream(
				new FileInputStream(InputJava8Test.class.getResource("/test.txt").getPath())))) {
			while ((c = is.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
