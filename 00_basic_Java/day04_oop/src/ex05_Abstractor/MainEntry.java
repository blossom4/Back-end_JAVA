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
		// �̿ϼ� Ŭ������ ��ü������ ��ü�� ������ �� ����.
		// ��ӹ��� Ŭ�����θ� ��ü�� ������ �� �ִ�.
//		Shape sh = new Shape();
		Shape t = new Triangle();
		
	}

}
