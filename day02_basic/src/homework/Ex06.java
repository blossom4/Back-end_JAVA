package homework;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Korean score :");
		int Korean =  sc.nextInt();
		System.out.println("English score :");
		int English = sc.nextInt();
		System.out.println("Math score :");
		int math = sc.nextInt();
		float total, average;
		
		total = Korean + English + math;
		average = total / 3;
		
		System.out.println("total: " + total);
		System.out.println("average: " + average);
	}

}
