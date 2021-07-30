package homework;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer data 2개를 입력하세요: ");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		String op = sc.next();

		// 입력받은 기호에 따라 다른 사칙연산을 수행한다.
		if (op.equals("+")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 + su2));
		} else if (op.equals("-")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 - su2));
		} else if (op.equals("*")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 * su2));
		} else if (op.equals("/")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 / su2));
		// 사칙연산기호가 아닌 다른 문자가 들어오면 Wrong Operator를 출력한다.
		} else {
			System.out.println("Wrong Operator");
		}
	}
}
