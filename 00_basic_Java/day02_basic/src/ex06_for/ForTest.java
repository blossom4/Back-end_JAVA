package ex06_for;

public class ForTest {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i < 101; i++) sum += i;
		
		System.out.println("total: " + sum);
		
		sum = 0;
		int count = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		} // end for
		
		System.out.println("sum: " + sum + "\n" + "count: " + count);
		
	}
}
