package homework;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 0 ~ 1 ������ ������ �̾Ƽ� 101�� ���� �� int�� ����ȯ�ϸ� 1 ~ 100 ������ ������ ���ڸ� ���� �� �ִ�.
		double dValue = Math.random();
		int answer = (int)(dValue * 101);
		int chance = 5;
		
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			// �� 5���� ��ȸ�� ���� ���� ��ȸ�� ������ش�.
			System.out.println("Chance: " + chance);
			int input = sc.nextInt();
			
			// �Է��� ���� ���� ���亸�� ũ�� "DOWN"�� ����Ѵ�.
			if (input > answer) System.out.println("DOWN");
			// �Է��� ���� ���� ���亸�� ������ "UP"�� ����Ѵ�.
			else if (input < answer) System.out.println("UP");
			// ������ ��� "CORRECT"�� ����ϰ� �����Ѵ�.
			else {
				System.out.println("CORRECT");
				System.exit(0);
			}
			chance--;
		}
		// �ᱹ ������ ������ ���ϰ� 5���� ��ȸ�� ��� �������� ��� ������ �������� ������ش�.
		System.out.println("The answer is " + answer);
	}
}
