package chapter3;

public class OperationEx5 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		int resultAnd = num1 & num2;
		
		System.out.println(resultAnd);
		
		int resultOr = num1 | num2;
		
		System.out.println(resultOr);
		
		int num3 = 5;
		
		// ��Ʈ�������� �̵��� ���ڸ��� 0���� ä���.
		// num3 * 2 �ѰͰ� ����.
		System.out.println(num3 << 1);
		System.out.println(num3 << 2);
		System.out.println(num3 >> 1);
	}

}
