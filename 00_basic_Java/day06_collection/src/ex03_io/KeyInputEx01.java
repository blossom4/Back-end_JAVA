package ex03_io;

import java.io.IOException;
import java.io.InputStream;

public class KeyInputEx01 {

	public static void main(String[] args) throws IOException {
		
		// Stream은 byte의 움직임이기 때문에 단일문자만 들어갈 수 있다.
		InputStream is = System.in;
		
		int num = is.read();
		
		System.out.println((char)num);
	}

}
