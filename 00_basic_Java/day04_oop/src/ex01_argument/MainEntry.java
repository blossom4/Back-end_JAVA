package ex01_argument;

public class MainEntry {

	public static void main(String[] args) {

		// ��ü����, �޸𸮿� �Ҵ�, �������Լ� �ڵ�ȣ��
		MainEntry me = new MainEntry();
		int res = me.plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(res);
		
		me.name(); // instance method
		
	}
	
//	// �Ű������� ������ ������ �ȴ�.
//	public static int plus (int x, int y) {
//		int sum = x + y;
//		return sum;
//	}
	
	// �Ű������� ������ ���·� ������ ������ ���������� �� �� �ִ�.
	public static int plus(int ...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) sum += num[i];
		
		return sum;
	}
	
	// static �Լ��� MainEntry�� �Լ����� ȣ���ϴ� �͸����� �ҷ���������,
	// instance �Լ��� MainEntry�� �Ҵ��� �ؼ� �ҷ�������Ѵ�.
	public void name() {
		System.out.println("Hi youngshin");
	}

}
