package homework;

public class Ex15_7 {

	public static void main(String[] args) {
		String line = "";
		// 5���� �����.
		for (int i = 1; i < 11; i++) {
			if (i < 6) {
				// 2n - 1��ŭ�� ���� ������ �þ��, �ݴ�� ������ ���� �߽�����
				// �翷�� ���� �ִ���� - (2n - 1)��ŭ�� ������ �پ���.
				for (int j = 0; j < (10 - 2 * i) / 2; j++) line += " ";
				for (int k = 0; k < 2 * i - 1; k++) line += "*";	
			} else if (i == 6) {
				line = "";
				continue;
			} else {
				// �߰��� �Ѿ�� �ݴ�� ������ �ð� ���� 2n - 1 ��ŭ�� �����Ѵ�.
				for (int j = 1; j < i - 5; j++) line += " ";
				for (int k = 0; k < 2 * (11 - i) - 1; k++) line += "*";
			}
			
			// �� ���� �ϼ��Ǹ� ����ϰ� �ʱ�ȭ�Ѵ�.
			System.out.println(line);
			line = "";
		}
	}

}
