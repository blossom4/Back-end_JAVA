package homework;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ĺ��� �Է����ּ���");
		// String���� �Է¹��� ���ĺ��� char�� ����ȯ ���ش�.
		char alphabet = sc.next().charAt(0);
		// ���ĺ��� �ش��ϴ� �ƽ�Ű��ȣ�� �����Ѵ�.
		int asciiNumber = (int)alphabet;
		
		// �ƽ�Ű��ȣ�� �빮�ڿ� �ش��ϸ� +32�ؼ� �ҹ��ڷ� �ٲ��ְ�,
		// �ҹ��ڿ� �ش��ϸ� -32�ؼ� �빮�ڷ� �ٲپ� ����Ѵ�.
		if (asciiNumber >= 65 && asciiNumber <= 90) asciiNumber += 32;
		else if (asciiNumber >= 96 && asciiNumber < 122) asciiNumber -= 32;
		// ���ĺ� �̿��� �ٸ� ���ڸ� �Է��ϸ� �״�� �����Ѵ�.
		else System.exit(0);
		
		System.out.println((char)asciiNumber);
	}
}
