package ex01_argument;

public class MainEntry {

	public static void main(String[] args) {

		// 객체생성, 메모리에 할당, 생성자함수 자동호출
		MainEntry me = new MainEntry();
		int res = me.plus(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		System.out.println(res);
		
		me.name(); // instance method
		
	}
	
//	// 매개변수의 개수가 고정이 된다.
//	public static int plus (int x, int y) {
//		int sum = x + y;
//		return sum;
//	}
	
	// 매개변수를 전개식 형태로 받으면 개수를 가변적으로 할 수 있다.
	public static int plus(int ...num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) sum += num[i];
		
		return sum;
	}
	
	// static 함수는 MainEntry가 함수명을 호출하는 것만으로 불러와지지만,
	// instance 함수는 MainEntry로 할당을 해서 불러와줘야한다.
	public void name() {
		System.out.println("Hi youngshin");
	}

}
