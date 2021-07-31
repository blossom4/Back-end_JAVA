package homework;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 이름, 총점, 평균, 석차를 저장할 배열을 선언한다.
		String[] names = new String[3];
		int[] totals = new int[3];
		int[] averages = new int[3];
		int[] ranks = new int[3];
		
		for (int i = 0; i < 3; i++) {
			// 학생들의 정보를 입력받고 해당 index에 값을 저장한다.
			System.out.println((i + 1) +"번 학생의 이름을 입력해주세요:");
			String name = input.next();
			System.out.println("국어 점수를 입력해주세요:");
			int Korean = input.nextInt();
			System.out.println("영어 점수를 입력해주세요:");
			int English = input.nextInt();
			System.out.println("수학 점수를 입력해주세요:");
			int Math = input.nextInt();
			
			names[i] = name;
			totals[i] = Korean + English + Math;
			averages[i] = totals[i] / 3;
		}
		
		// 석차 default 값을 3등으로 잡고 averages 배열을 돌면서 자신보다 낮은 점수가 있을 경우,
		// 나의 등수가 한 단계 올라가야하므로 rank -1을 해준다.
		int rank = 3;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (totals[i] > totals[j]) rank--;
			}
			ranks[i] = rank;
			rank = 3;
		}
		
		// 결과 출력
		for (int i = 0; i < 3; i++) {
			System.out.println("이름: " + names[i]);
			System.out.println("총점: " + totals[i] + " " + "평균: " + averages[i] + " " + "석차: " + ranks[i] + "\n");
		}
	}

}
