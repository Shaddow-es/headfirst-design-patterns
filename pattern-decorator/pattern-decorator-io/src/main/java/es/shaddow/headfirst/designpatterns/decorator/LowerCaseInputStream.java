package es.shaddow.headfirst.designpatterns.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream is) {
		super(is);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1) ? c : Character.toLowerCase(c);
	}

	@Override
	public int read(byte[] bytes, int offset, int length) throws IOException {
		int result = super.read(bytes, offset, length);
		for (int i = 0; i < result; i++) {
			bytes[i] = (byte) Character.toLowerCase((char) bytes[i]);
		}
		return result;
	}

}
