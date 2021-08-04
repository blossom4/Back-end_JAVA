package ex03_io;

import java.io.IOException;

public class KeyInputEx02 {

	public static void main(String[] args) throws Exception {
			int n1 = 0, n2 = 0;
			
			while((n1 = System.in.read()) != -1) {
				System.out.println((char)n1);
			}
		}
	
}
