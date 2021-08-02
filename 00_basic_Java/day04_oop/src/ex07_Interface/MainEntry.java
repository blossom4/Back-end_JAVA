package ex07_Interface;

// Only Abstract method, final field
interface A {
	// final�� �����ص� �ڵ����� final�� ���ְ� �� ǥ�÷� ������ Italic Style�̴�.
	int x = 90;
	final int y = 77;
	char ch = 'A';
	
	// Abstract �����ص� �ڵ����� abstract�� ���ִ�.
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

// interface ���� ��ӿ����� extends�� ����Ѵ�.
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

// ���߻�� �� ���� extends interface ������ �ؾ��Ѵ�.
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
		// 1. �ڽ����� ��ü ����
		Rectangle r1 = new Rectangle();
		
		// 2. �θ�� ��ü ����
		D r2 = new Rectangle();
		B r3 = new Rectangle();
	}

}
