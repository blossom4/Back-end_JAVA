package homework;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력해주세요");
		// String으로 입력받은 알파벳을 char로 형변환 해준다.
		char alphabet = sc.next().charAt(0);
		// 알파벳에 해당하는 아스키번호를 저장한다.
		int asciiNumber = (int)alphabet;
		
		// 아스키번호가 대문자에 해당하면 +32해서 소문자로 바꿔주고,
		// 소문자에 해당하면 -32해서 대문자로 바꾸어 출력한다.
		if (asciiNumber >= 65 && asciiNumber <= 90) asciiNumber += 32;
		else if (asciiNumber >= 96 && asciiNumber < 122) asciiNumber -= 32;
		// 알파벳 이외의 다른 문자를 입력하면 그대로 종료한다.
		else System.exit(0);
		
		System.out.println((char)asciiNumber);
	}
}
