package ex01_exception;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("num1, num2 = ");
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("operator: + - * / ");
		
		char operator = input.next().charAt(0);
		
		int result = 0;
		
		try {
			if (operator == '+') result = num1 + num2;
			else if (operator == '-') result = num1 - num2;
			else if (operator == '*') result = num1 * num2;
			else if (operator == '/') result = num1 / num2;
		} catch (Exception e) {
				System.out.println(" Cannot divide with 0");
				// 예외처리에 대한 기본적인 message들이 들어있다.
				System.out.println(e.getMessage());
				// 정확히 어느 위치에서 어떤 에러가 발생하는지 시스템에서 알려준다.
				e.printStackTrace();
				System.exit(0);
		}

		
		System.out.println("\n" + num1 + operator + num2 + " = " + result);
	}
}
