package ex03_oop;

public class MainEntry {

	public static void main(String[] args) {
		// 매개변수를 둘다 받은 class
		System.out.println("Point");
		Point pt1 = new Point(1, 1);
		pt1.display();
		System.out.println(pt1);
		
		// 매개변수를 받지 않은 class int default값인 0을 받아온다.
		Point pt2 = new Point();
		pt2.display();
	
		Point pt3  = new Point(3);
		pt3.display();
		
		// 다른클래스에서 상속받아오면 default값을 받아오는데 지정값을 받아오고싶은경우
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
