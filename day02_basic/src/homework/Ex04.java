package homework;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 0 ~ 1 사이의 난수를 뽑아서 101을 곱한 후 int로 형변환하면 1 ~ 100 범위의 랜덤한 숫자를 뽑을 수 있다.
		double dValue = Math.random();
		int answer = (int)(dValue * 101);
		int chance = 5;
		
		for (int i = 0; i < 5; i++) {
			Scanner sc = new Scanner(System.in);
			// 총 5번의 기회중 현재 남은 기회를 출력해준다.
			System.out.println("Chance: " + chance);
			int input = sc.nextInt();
			
			// 입력한 수가 실제 정답보다 크면 "DOWN"을 출력한다.
			if (input > answer) System.out.println("DOWN");
			// 입력한 수가 실제 정답보다 작으면 "UP"을 출력한다.
			else if (input < answer) System.out.println("UP");
			// 정답일 경우 "CORRECT"를 출력하고 종료한다.
			else {
				System.out.println("CORRECT");
				System.exit(0);
			}
			chance--;
		}
		// 결국 정답을 맞추지 못하고 5번의 기회를 모두 소진했을 경우 정답이 뭐였는지 출력해준다.
		System.out.println("The answer is " + answer);
	}
}
