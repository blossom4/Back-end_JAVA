package homework;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("num1을 입력해주세요: ");
		int num1 = sc.nextInt();
		
		// num2가 0이라면 break에 도달하지 못하기 때문에 계속해서 다시 입력을 받는다.
		while (true) {
			System.out.println("num2를 입력해주세요: ");
			int num2 = sc.nextInt();
			if (num2 == 0) continue;
			
			System.out.println(num1 / num2);	
			break;
		}	
	}
}
