package homework;

public class Ex15_3 {

	public static void main(String[] args) {
		// ����� ���� ������ String ����
		String line = "";
		// 5���� �ݺ��ϸ鼭, " "�� �ϳ��� �ٿ������� "*"�� �ϳ��� �÷�������.
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				line += " ";
			}
			for (int k = 0; k < i + 1; k++) {
				line += "*";
			}
			// ������� �� ���� ����ϰ� �ʱ�ȭ�Ѵ�.
			System.out.println(line);
			line = "";
		}
	}

}
