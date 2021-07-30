package quiz;

import java.util.Scanner;

// 성적처리 프로그램 작성
// 3과목 (국어, 영어, 전산) 점수 입력 받고, 이름 입력 받아서 총점, 평균, 평점(학점) 구하기
// 점수는 0 ~ 100점의 값만 입력
// 계속 입력할지에 대한 물음 넣기 (y / n)
public class MainEntry {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
			// 각 과목점수를 입력받고 0 ~ 100 사이의 점수가 아니면 continue
			// 국어
			System.out.println("국어점수를 입력해주세요: ");
			int Korean = input.nextInt();
			if (Korean < 0 || Korean > 100) continue;
			// 영어
			System.out.println("영어점수를 입력해주세요: ");
			int English = input.nextInt();
			if (English < 0 || English > 100) continue;
			// 수학
			System.out.println("수학점수를 입력해주세요: ");
			int Math = input.nextInt();
			if (Math < 0 || Math > 100) continue;
			// 이름
			System.out.println("이름을 입력해주세요: ");
			String name = input.next();
			
			int total = (Korean + English + Math);
			int average = total / 3;
			
			System.out.println(name + "\n" + "총점:" + total + " 평균: " + average);
			
			System.out.println("\n계속 입력하시겠습니까? (y / n)");
			String exit = input.next();
			if (exit.equals("n")) break;
		}
	}

}
