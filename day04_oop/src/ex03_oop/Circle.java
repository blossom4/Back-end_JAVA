package ex03_oop;

public class Circle extends Point {
//	private int x, y, r;
	private int r;

	public Circle() {
//		x = y = 10;
		r = 5;
	}
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	// extends�� �ٸ� class�� ����ϰ� super�� �ҷ��ͼ� ����� �� �ִ�.
	public void display() {
		System.out.println("x = " + super.getX() + " y = " + super.getY() + " r = " + r);
	}
}
