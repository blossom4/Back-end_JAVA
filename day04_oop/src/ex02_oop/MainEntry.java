package ex02_oop;

class Point {
	// class에 선언된 변수는 default 값이 있다.
	// int: 0, float: 0.0, String: null
	
	int x; // 멤버변수
	String y;
	
	private int i; // 현재 class 내부에서만 사용가능하다.
	
	// getter, setter method
	public int getX() { return x; }
	public String getY() { return y; }
	public void setX(int x) { this.x = x; }
	public void SetY(String y) { this.y = y; }
	
	// output method
	public void display() {
		System.out.println(getX() + " " + getY());
	}

	// 멤버변수의 초기화를 담당한다. (default constructor)
	// 1. 고정값을 쓸 경우
//	public Point() {
//		x = -1;
//		y = "default";
//	}
	
	// 2. 매개변수를 받아서 변경하며 사용할 경우
	public Point(int x, String y) {
		this.x = x;
		this.y = y;
	}
}

// 서로 다른 class에 직접적으로 접근할 수 없다.
// public은 Main함수 한 곳만 쓴다.
public class MainEntry {

	public static void main(String[] args) {

		// 객체 생성, 메모리에 할당, 생성자함수 자동호출
		// 1. 매개변수 없이 고정값을 사용할 경우
//		Point pt = new Point();
		// 2. 매개변수를 받아 사용할 경우
		Point pt = new Point(-1, "default");
		
		// default value
		System.out.println(pt.x + " " + pt.y);
		
		pt.setX(100);
		pt.SetY("Hi");
		
//		System.out.println(pt.getX());
//		System.out.println(pt.getY());
		
		pt.display();

	}

}
