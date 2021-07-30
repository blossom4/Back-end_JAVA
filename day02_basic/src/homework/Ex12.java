package homework;

public class Ex12 {
	public static void main(String[] args) {
		int total = 0;
		int sum = 0;
		
		for (int i = 1; i < 6; i++) {
			sum += i;
			total += sum;
		}
		
		System.out.println(total);
	}
}
