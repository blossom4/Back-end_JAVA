package quiz;

import java.util.Scanner;

// ����ó�� ���α׷� �ۼ�
// 3���� (����, ����, ����) ���� �Է� �ް�, �̸� �Է� �޾Ƽ� ����, ���, ����(����) ���ϱ�
// ������ 0 ~ 100���� ���� �Է�
// ��� �Է������� ���� ���� �ֱ� (y / n)
public class MainEntry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			// �� ���������� �Է¹ް� 0 ~ 100 ������ ������ �ƴϸ� continue
			// ����
			System.out.println("���������� �Է����ּ���: ");
			int Korean = input.nextInt();
			if (Korean < 0 || Korean > 100) continue;
			// ����
			System.out.println("���������� �Է����ּ���: ");
			int English = input.nextInt();
			if (English < 0 || English > 100) continue;
			// ����
			System.out.println("���������� �Է����ּ���: ");
			int Math = input.nextInt();
			if (Math < 0 || Math > 100) continue;
			// �̸�
			System.out.println("�̸��� �Է����ּ���: ");
			String name = input.next();
			
			int total = (Korean + English + Math);
			int average = total / 3;
			
			System.out.println(name + "\n" + "����:" + total + " ���: " + average);
			
			System.out.println("\n��� �Է��Ͻðڽ��ϱ�? (y / n)");
			String exit = input.next();
			if (exit.equals("n")) break;
		}
	}

}
