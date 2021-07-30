package homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 학생 이름과 평균점수를 저장할 ArrayList를 선언한다.
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> averages = new ArrayList<>();
		
		// 학생 7명의 정보를 받는다.
		for (int i = 0; i < 7; i++) {
			// 이름 입력
			System.out.println("What is your name? : ");
			String name = sc.next();
			// 과목별 점수 입력
			System.out.println("Korean score :");
			int Korean =  sc.nextInt();
			System.out.println("English score :");
			int English = sc.nextInt();
			System.out.println("Math score :");
			int math = sc.nextInt();
			float total, average;
			
			total = Korean + English + math;
			average = total / 3;
			
			names.add(name);
			averages.add((int)average);
		}
		// 정보들이 담긴 ArrayList를 차례로 출력한다.
		for (int i = 0; i < 7; i++) System.out.println("이름: " + names.get(i) + "\n" + "평균점수: " + averages.get(i));

	}

}
