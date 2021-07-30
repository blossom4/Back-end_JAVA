package ex07_dowhile;

public class DoWhileTest {
	public static void main(String[] args) {
		int a = 1, b = 1; // 변수 초기화
		
		do {
			b = 1;
			do {
				System.out.print(b + " ");
				b++;
			} while (b < 4); // 조건
			
			System.out.println();
			a++;
		} while (a < 3); // 조건
	}
}
