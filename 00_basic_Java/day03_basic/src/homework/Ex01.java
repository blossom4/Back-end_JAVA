package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// �̸�, ����, ���, ������ ������ �迭�� �����Ѵ�.
		String[] names = new String[3];
		int[] totals = new int[3];
		int[] averages = new int[3];
		int[] ranks = new int[3];
		
		for (int i = 0; i < 3; i++) {
			// �л����� ������ �Է¹ް� �ش� index�� ���� �����Ѵ�.
			System.out.println((i + 1) +"�� �л��� �̸��� �Է����ּ���:");
			String name = input.next();
			System.out.println("���� ������ �Է����ּ���:");
			int Korean = input.nextInt();
			System.out.println("���� ������ �Է����ּ���:");
			int English = input.nextInt();
			System.out.println("���� ������ �Է����ּ���:");
			int Math = input.nextInt();
			
			names[i] = name;
			totals[i] = Korean + English + Math;
			averages[i] = totals[i] / 3;
		}
		
		// ���� default ���� 3������ ��� averages �迭�� ���鼭 �ڽź��� ���� ������ ���� ���,
		// ���� ����� �� �ܰ� �ö󰡾��ϹǷ� rank -1�� ���ش�.
		int rank = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (totals[i] > totals[j]) rank--;
			}
			ranks[i] = rank;
			rank = 3;
		}
		
		// ��� ���
		for (int i = 0; i < 3; i++) {
			System.out.println("�̸�: " + names[i]);
			System.out.println("����: " + totals[i] + " " + "���: " + averages[i] + " " + "����: " + ranks[i] + "\n");
		}
	}

}
