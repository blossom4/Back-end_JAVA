package homework;

public class Ex13 {

	public static void main(String[] args) {
		int total = 0;
		int minus = -1;
		
		// ��ȣ�� �ٲ㰡�鼭 total�� ���Ѵ�.
		for (int i = 1; i < 11; i++) {
			total += i * minus;
			minus *= -1;
		}
		
		System.out.println(total);
	}
}
