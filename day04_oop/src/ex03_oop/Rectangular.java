package ex03_oop;

public class Rectangular extends Point {
	private int x2, y2;

	public Rectangular() {
		x2 = 4;
		y2 = 4;
	}
	
	public Rectangular(int x, int y, int x2, int y2) {
//		this.x = x;
//		this.y = y;
		// ��ӹ��� ��ҵ��� ��������� ǥ���� ���� �ִ�.
		super(x, y);
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void display() {
		System.out.println("x = " + super.getX() + " y = " + super.getY());
		System.out.println("x2 = " + getX2() + " y2 = " + getY2());
	}
}
