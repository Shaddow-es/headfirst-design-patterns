package es.shaddow.headfirst.designpatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class InputTest {

	public static void main(String[] args) {
		int c;
		InputStream is = null;

		try {
			URL urlFile = InputTest.class.getResource("/test.txt");
			is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(urlFile.getPath())));
			while ((c = is.read()) >= 0) {
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
			}
		}
	}

}
