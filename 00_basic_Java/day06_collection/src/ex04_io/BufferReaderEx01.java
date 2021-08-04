package ex04_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferReaderEx01 {
	
	public static void main(String[] args) throws IOException {
//		InputStream is = System.in;
//		
//		Reader reader = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Charactor Input: ");
		
		// 예외처리
		String str = br.readLine();
		
		System.out.println(str);
		
		System.out.println("Integer x Input: ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Integer y Input: ");
		int y = Integer.parseInt(br.readLine());
		System.out.println("add = " + (x + y));
	}
}
