package ex03_io;

import java.io.IOException;
import java.io.InputStream;

public class KeyInputEx01 {

	public static void main(String[] args) throws IOException {
		
		// Stream�� byte�� �������̱� ������ ���Ϲ��ڸ� �� �� �ִ�.
		InputStream is = System.in;
		
		int num = is.read();
		
		System.out.println((char)num);
	}

}
