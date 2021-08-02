package ex06_Abstractor;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		// 1. �� Ŭ������ ��ü �����ϴ� ���
//		Triangle t = new Triangle();
//		t.draw();
		
		// 2. �θ� Ŭ������ ��ü �����ϴ� ���
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
		
		// �迭�� �̿��� ����
		Shape[] shs = new Shape[3];
		shs[0] = new Circle();
		shs[1] = new Rectangular();
		shs[2] = new Triangle();
		
		String[] name = {"��", "�簢��", "�ﰢ��"};
		for (int i = 0; i < shs.length; i++) {
			shs[i].show(name[i]);
		}

	}
}
