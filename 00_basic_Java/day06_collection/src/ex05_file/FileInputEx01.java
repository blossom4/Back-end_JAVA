package ex05_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			OutputStream os = new FileOutputStream("test.txt");
			
			while (true) {
				System.out.println("Input String: ");
				String str = input.nextLine() + "\r\n";
				
				if (str.equalsIgnoreCase("EXIT\r\n")) break;
				
				os.write(str.getBytes());
				System.out.println(str);
			}
			
			System.out.println("test.txt save success!");
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("처리결과와 관계없이 항상 실행된다.");
		}
	}

}
