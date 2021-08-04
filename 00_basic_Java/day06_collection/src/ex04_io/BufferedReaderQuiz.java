package ex04_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

// ������ 1���� �Է¹ް�, ���� ������ 2���� �Է¹޾Ƽ� ��Ģ�������� ����Ѵ�.

public class BufferedReaderQuiz {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Choose the operator (+, -, *, /) : ");
		String operator = br.readLine();
		
		if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
			System.out.println("Invalid operator");
			return;
		}
		
		System.out.println("Input x: ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Input y: ");
		int y = Integer.parseInt(br.readLine());
		
		float result = 0;
		if (operator.equals("+")) result = x + y;
		else if (operator.equals("-")) result = x - y;
		else if (operator.equals("*")) result = x * y;
		else if (operator.equals("/")) result = x / y;
		
		System.out.println(result);
	}
}
