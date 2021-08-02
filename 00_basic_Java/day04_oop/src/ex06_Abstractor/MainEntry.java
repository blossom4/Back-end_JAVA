package ex06_Abstractor;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각 클래스로 객체 생성하는 방법
//		Triangle t = new Triangle();
//		t.draw();
		
		// 2. 부모 클래스로 객체 생성하는 방법
//		Shape c = new Circle();
//		c.draw();
//		
//		Shape sh = new Rectangular();
//		sh.draw();
//		
//		sh = new Circle();
//		sh.draw();
//		sh = new Triangle();
//		sh.draw();
		
		Shape sh = new Circle();
		sh.show("Circle");
		sh = new Rectangular();
		sh.show("Rectangular");
		sh = new Triangle();
		sh.show("Triangle");
		
		// 배열을 이용한 형태
		Shape[] shs = new Shape[3];
		shs[0] = new Circle();
		shs[1] = new Rectangular();
		shs[2] = new Triangle();
		
		String[] name = {"원", "사각형", "삼각형"};
		for (int i = 0; i < shs.length; i++) {
			shs[i].show(name[i]);
		}

	}
}
