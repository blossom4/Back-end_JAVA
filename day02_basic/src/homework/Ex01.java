package homework;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("가격을 입력해주세요:");
		int price = sc.nextInt();
		// 지불할 수 있는 돈의 종류를 미리 array에 저장한다.
		int[] money = {10000, 5000, 1000, 500, 100, 50, 10};
		// 마지막에 필요한 돈의 개수와 함께 출력할 한글 string을 미리 저장한다.
		String[] moneyKR = {"만원", "오천원", "천원", "오백원", "백원", "오십원", "십원"};
		int[] moneyCount = new int[7];
		
		// 1. 배열을 순회하면서 큰 단위의 돈부터 최대로 가능한 액수를 미리 뽑는다.
		// 2. 뽑은 액수를 제외한 나머지 금액에 대해서 반복한다.
		for (int i = 0; i < 7; i++) {
			moneyCount[i] = price / money[i];
			price -= money[i] * moneyCount[i];
		}
		
		// 형식에 맞게 출력한다.
		for (int i = 0; i < 7; i++) {
			System.out.println(moneyKR[i] + ": " + moneyCount[i]);
		}

	}
}
