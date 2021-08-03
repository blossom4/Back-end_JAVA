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
				// ����ó���� ���� �⺻���� message���� ����ִ�.
				System.out.println(e.getMessage());
				// ��Ȯ�� ��� ��ġ���� � ������ �߻��ϴ��� �ý��ۿ��� �˷��ش�.
				e.printStackTrace();
				System.exit(0);
		}

		
		System.out.println("\n" + num1 + operator + num2 + " = " + result);
	}
}
