package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �л� �̸��� ��������� ������ ArrayList�� �����Ѵ�.
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> averages = new ArrayList<>();
		
		// �л� 7���� ������ �޴´�.
		for (int i = 0; i < 7; i++) {
			// �̸� �Է�
			System.out.println("What is your name? : ");
			String name = sc.next();
			// ���� ���� �Է�
			System.out.println("Korean score :");
			int Korean =  sc.nextInt();
			System.out.println("English score :");
			int English = sc.nextInt();
			System.out.println("Math score :");
			int math = sc.nextInt();
			float total, average;
			
			total = Korean + English + math;
			average = total / 3;
			
			names.add(name);
			averages.add((int)average);
		}
		// �������� ��� ArrayList�� ���ʷ� ����Ѵ�.
		for (int i = 0; i < 7; i++) System.out.println("�̸�: " + names.get(i) + "\n" + "�������: " + averages.get(i));

	}

}
