package ex07_Interface;

// Only Abstract method, final field
interface A {
	// final을 생략해도 자동으로 final이 들어가있고 그 표시로 변수가 Italic Style이다.
	int x = 90;
	final int y = 77;
	char ch = 'A';
	
	// Abstract 생략해도 자동으로 abstract가 들어가있다.
	// public abstract void show();
	public void show();
	public abstract void disp();
} // A end

interface B {
	void bView();
} // B end

interface C {
	String name = "Blossom";
	public void draw();
} // C end

// interface 간의 상속에서도 extends를 사용한다.
interface D extends B {
	void dView();
	
} // D end

class Rectangle implements D {
	@Override
	public void bView() {
		
	}
	
	@Override
	public void dView() {
		
	}
	
	public void rView() {
		System.out.println("Rectangle View");
	}
}

class Shape {
	
}

// 다중상속 할 때는 extends interface 순서로 해야한다.
class Multi extends Shape implements A, B, C, D {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {

	public static void main(String[] args) {
		// 1. 자신으로 객체 생성
		Rectangle r1 = new Rectangle();
		
		// 2. 부모로 객체 생성
		D r2 = new Rectangle();
		B r3 = new Rectangle();
	}

}
