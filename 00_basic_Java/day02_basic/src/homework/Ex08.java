package homework;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1�� �Է����ּ���: ");
		int num1 = sc.nextInt();
		
		// num2�� 0�̶�� break�� �������� ���ϱ� ������ ����ؼ� �ٽ� �Է��� �޴´�.
		while (true) {
			System.out.println("num2�� �Է����ּ���: ");
			int num2 = sc.nextInt();
			if (num2 == 0) continue;
			
			System.out.println(num1 / num2);	
			break;
		}	
	}
}
