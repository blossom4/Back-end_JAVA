package ex03_method;

public class MainEntry {
	
	public void display() { // instance method - object create
		System.out.println("none static display() called");
	}

	public static void main(String[] args) { // 시작점. 메인에서 항상 먼저 시작한다.
		System.out.println("main call ");
		show();
		
		// display(); 를 하면 에러가 발생한다. 
		// Error - Cannot make a static reference to the non-static method display() from the type MainEntry
		MainEntry me = new MainEntry(); // 객체를 생성해서 메모리에 할당하고, 생성자함수를 자동호출한다.
		me.display();
		
		line();
		line("222222222222222222222222222");
		line("3", 20);
		System.out.println("main finished "); // 메인에서 시작하고 메인에서 끝난다.
	}
	
	// 매개변수 없고, 리턴타입도 없는 경우
	public static void show() { // static method
		System.out.println("static show() called");
	}
	
	public static void line() { // static method
		System.out.println("1111111111111111111111111111111");
		
	}
	
	public static void line(String str) { // static method
		System.out.println(str);
		
	}
	
	public static void line(String str, int n) { // static method
		for (int i = 0; i < n; i++) System.out.print(str);
		
		System.out.println();
		
	}

}
