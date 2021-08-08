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
		
		// 비트연산자의 이동은 빈자리를 0으로 채운다.
		// num3 * 2 한것과 같다.
		System.out.println(num3 << 1);
		System.out.println(num3 << 2);
		System.out.println(num3 >> 1);
	}

}
