package ex03_oop;

public class Point {
	
//	private int x, y;
	protected int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		
	}
	
	public Point(int x) {
		this.x = x;
		y = -1;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println("x = " + x + " y = " + y + "\t" + "display");
	}
	
	// toString으로 직접 값을 받아올 수 있다.
	public String toString() {
		return "x = " + x + " y = " + y + "\t" + "toString";
	}
	

}
