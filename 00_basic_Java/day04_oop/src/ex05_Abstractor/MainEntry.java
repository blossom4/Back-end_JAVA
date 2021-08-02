package ex05_Abstractor;

// Normal Class
class Point {
	int x, y;
	
	public void show() {
		
	}
}

// Abstract Class
abstract class Shape {
	
	public abstract void view();
	
	public void name() {
		System.out.println("Hi my name is Blossom");
	}
}

class Triangle extends Shape {
	@Override
	public void view() {
		System.out.println("Triangle");
	}
}

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		// 미완성 클래스는 자체적으로 객체를 생성할 수 없다.
		// 상속받은 클래스로만 객체를 생성할 수 있다.
//		Shape sh = new Shape();
		Shape t = new Triangle();
		
	}

}
