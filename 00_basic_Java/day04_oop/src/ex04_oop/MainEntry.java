package ex04_oop;

// default constructor 
//API �����
public class MainEntry {
	// ����Ű Alt + Shift + J
	/**
	 * @author blossom
	 * @param args main�� �ƹ� ���� ���� �ʴ´�.
	 * @param x ù�� ° ������ ����
	 * @param y �ι� ° ������ ����
	 * @param result x�� y�� ���� �����ϴ� ����
	 */
	public static void main(String[] args) {
		int x, y, result;
		char ch = 'A';
		String message;
		
		x = 5; y = 10;
		message = "New Blossom";
		
		result = mutiply(x, y);
		
		System.out.println(ch);
		System.out.println(message);
		System.out.println(result);
	}
	
	public static int mutiply(int x, int y) {
		return x * y;
	}
	

}
