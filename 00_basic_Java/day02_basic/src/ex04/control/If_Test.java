package ex04.control;

import java.util.Scanner;

public class If_Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Integer data 2���� �Է��ϼ���: ");
		int su1 = sc.nextInt();
		int su2 = sc.nextInt();
		String op = sc.next();

		if (op.equals("+")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 + su2));
		} else if (op.equals("-")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 - su2));
		} else if (op.equals("*")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 * su2));
		} else if (op.equals("/")) {
			System.out.println(su1 + " " + op + " " + su2 + " = " + (su1 / su2));
		} else {
			System.out.println("Wrong Operator");
		}
	}
}
