package homework;

public class Ex03 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		// 1 ~ 100 ���� �ݺ��ϸ鼭 3���� ��������� ��� sum�� ���ϰ� count +1�� �����ش�.
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("sum: " + sum + "\n" + "count: " + count);
	}
}
