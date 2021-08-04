package ex03_io;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		System.out.println("num, s1, s2 = ");
//		int num = input.nextInt();
//		input.nextLine();
//		String s1 = input.nextLine();
//		String s2 = input.nextLine();
//		
//		System.out.println(num + ", " + s1 + ", " + s2);
		
		if (args.length <= 0) {
			System.out.println("No input");
			return;
		}
		
		String a = args[0];
		String b = args[1];
		
		System.out.println(a + b);
		
		int c = Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
		System.out.println(c + d);
	}

}
