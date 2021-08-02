package ex03_oop;

public class MainEntry {

	public static void main(String[] args) {
		// �Ű������� �Ѵ� ���� class
		System.out.println("Point");
		Point pt1 = new Point(1, 1);
		pt1.display();
		System.out.println(pt1);
		
		// �Ű������� ���� ���� class int default���� 0�� �޾ƿ´�.
		Point pt2 = new Point();
		pt2.display();
	
		Point pt3  = new Point(3);
		pt3.display();
		
		// �ٸ�Ŭ�������� ��ӹ޾ƿ��� default���� �޾ƿ��µ� �������� �޾ƿ���������
		System.out.println("\nCircle");
		Circle c1 = new Circle();
		c1.display();
		
		Circle c2 = new Circle(1, 2, 3);
		c2.display();
		
		System.out.println("\nRectangular");
		Rectangular r1 = new Rectangular();
		r1.display();
		System.out.println(r1);
		
		Rectangular r2 = new Rectangular(1, 1, 5, 5);
		r2.display();
		
	}

}
