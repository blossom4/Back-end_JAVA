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
		
		System.out.println("while: 1부터 10까지의 합은 " + sum + "입니다.");
		
		// do while
		// 조건에 맞지 않더라도 최초 한번은 실행이 된다.
		int num1 = 1;
		int sum1 = 0;
		
		do {
			sum1 += num1;
			num1++;
		} while (num1 < 1);
		
		System.out.println("do while: 1부터 10까지의 합은 " + sum1 + "입니다.");
	}

}
