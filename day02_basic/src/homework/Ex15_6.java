package homework;

public class Ex15_6 {

	public static void main(String[] args) {
		String line = "";
		
		for (int i = 0; i < 5; i++) {
			// ���� 9������ 2 * i���� �ٿ������� ������ �׸�ŭ�� �÷�������.
			for (int j = 0; j < 2 * i; j++) line += " ";
			for (int k = 9 - 2 * i; k > 0; k--) line += "*";
			
			// �� ���� �ϼ��ɶ����� ����ϰ� �ʱ�ȭ�Ѵ�.
			System.out.println(line);
			line = "";
		}
	}

}
