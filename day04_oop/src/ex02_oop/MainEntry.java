package ex02_oop;

class Point {
	// class�� ����� ������ default ���� �ִ�.
	// int: 0, float: 0.0, String: null
	
	int x; // �������
	String y;
	
	private int i; // ���� class ���ο����� ��밡���ϴ�.
	
	// getter, setter method
	public int getX() { return x; }
	public String getY() { return y; }
	public void setX(int x) { this.x = x; }
	public void SetY(String y) { this.y = y; }
	
	// output method
	public void display() {
		System.out.println(getX() + " " + getY());
	}

	// ��������� �ʱ�ȭ�� ����Ѵ�. (default constructor)
	// 1. �������� �� ���
//	public Point() {
//		x = -1;
//		y = "default";
//	}
	
	// 2. �Ű������� �޾Ƽ� �����ϸ� ����� ���
	public Point(int x, String y) {
		this.x = x;
		this.y = y;
	}
}

// ���� �ٸ� class�� ���������� ������ �� ����.
// public�� Main�Լ� �� ���� ����.
public class MainEntry {

	public static void main(String[] args) {

		// ��ü ����, �޸𸮿� �Ҵ�, �������Լ� �ڵ�ȣ��
		// 1. �Ű����� ���� �������� ����� ���
//		Point pt = new Point();
		// 2. �Ű������� �޾� ����� ���
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
