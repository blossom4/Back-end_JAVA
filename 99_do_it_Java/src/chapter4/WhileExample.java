package chapter4;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		// while
		while (num <= 10) {
			sum += num;
			num++;
		}
		
		System.out.println("while: 1���� 10������ ���� " + sum + "�Դϴ�.");
		
		// do while
		// ���ǿ� ���� �ʴ��� ���� �ѹ��� ������ �ȴ�.
		int num1 = 1;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num1++;
		} while (num1 < 1);
		
		System.out.println("do while: 1���� 10������ ���� " + sum1 + "�Դϴ�.");
	}

}
