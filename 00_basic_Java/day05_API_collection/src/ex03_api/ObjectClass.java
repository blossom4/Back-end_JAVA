package ex03_api;

class Point {
	
}

public class ObjectClass {
	public static void main(String[] args) {
		// 객체생성, 메모리에 할당, 생성자함수 자동호출
		Point pt = new Point();
		
		System.out.println("Point pt Information");
		System.out.println("Class Name: " + pt.getClass());
		System.out.println("hashcode: " + pt.hashCode());
		System.out.println("Object String: " + pt.toString());
		System.out.println("Object String: " + pt);
		System.out.println("10진수 %d: " + 0x2a139a55);
		
		Point pt2 = new Point();
		System.out.println("\nPoint pt2 Information");
		System.out.println("Class Name: " +pt2.getClass());
		System.out.println("hashocde: " + pt2.hashCode());
		System.out.println("Object String: " + pt2.toString());
		System.out.println("Object String: " + pt2);
		System.out.println("10진수 %d: " + 0x15db9742);
	}
}
