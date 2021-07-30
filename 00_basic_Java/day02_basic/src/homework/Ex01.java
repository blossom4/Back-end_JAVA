package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���:");
		int price = sc.nextInt();
		// ������ �� �ִ� ���� ������ �̸� array�� �����Ѵ�.
		int[] money = {10000, 5000, 1000, 500, 100, 50, 10};
		// �������� �ʿ��� ���� ������ �Բ� ����� �ѱ� string�� �̸� �����Ѵ�.
		String[] moneyKR = {"����", "��õ��", "õ��", "�����", "���", "���ʿ�", "�ʿ�"};
		int[] moneyCount = new int[7];
		
		// 1. �迭�� ��ȸ�ϸ鼭 ū ������ ������ �ִ�� ������ �׼��� �̸� �̴´�.
		// 2. ���� �׼��� ������ ������ �ݾ׿� ���ؼ� �ݺ��Ѵ�.
		for (int i = 0; i < 7; i++) {
			moneyCount[i] = price / money[i];
			price -= money[i] * moneyCount[i];
		}
		
		// ���Ŀ� �°� ����Ѵ�.
		for (int i = 0; i < 7; i++) {
			System.out.println(moneyKR[i] + ": " + moneyCount[i]);
		}

	}
}
