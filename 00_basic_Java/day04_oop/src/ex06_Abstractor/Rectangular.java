package ex06_Abstractor;

public class Rectangular extends Shape {
	
	int w = 3, h = 5;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("�簢���� ����: " + result);
	}
	
	@Override
	public void show(String name) {
		calc();
		System.out.println(name + "(name) ����: " + result);
	}
}
