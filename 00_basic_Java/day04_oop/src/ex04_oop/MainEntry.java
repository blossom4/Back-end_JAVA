package ex04_oop;

// default constructor 
//API 만들기
public class MainEntry {
	// 단축키 Alt + Shift + J
	/**
	 * @author blossom
	 * @param args main은 아무 값도 받지 않는다.
	 * @param x 첫번 째 정수형 변수
	 * @param y 두번 째 정수형 변수
	 * @param result x와 y의 곱을 저장하는 변수
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
