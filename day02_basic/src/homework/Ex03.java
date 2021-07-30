package homework;

public class Ex03 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 0;
		
		// 1 ~ 100 까지 반복하면서 3으로 나누어떨어질 경우 sum에 더하고 count +1씩 더해준다.
		for (int i = 1; i < 101; i++) {
			if (i % 3 == 0) {
				sum += i;
				count++;
			}
		}
		
		System.out.println("sum: " + sum + "\n" + "count: " + count);
	}
}
