package homework;

public class Ex15_5 {

	public static void main(String[] args) {
		String line = "";
		// 5���� �����.
		for (int i = 1; i < 6; i++) {
			// 2n - 1��ŭ�� ���� ������ �þ��, �ݴ�� ������ ���� �߽�����
			// �翷�� ���� �ִ���� - (2n - 1)��ŭ�� ������ �پ���.
			for (int j = 0; j < (10 - 2 * i) / 2; j++) line += " ";
			for (int k = 0; k < 2 * i - 1; k++) line += "*";
			for (int j = 0; j < (10 - 2 * i) / 2; j++) line += " ";
			
			// �� ���� �ϼ��Ǹ� ����ϰ� �ʱ�ȭ�Ѵ�.
			System.out.println(line);
			line = "";
		}
	}

}
