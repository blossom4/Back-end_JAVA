package ex06_Abstractor;

public class Triangle extends Shape {

	int w = 10, h = 20;
	
	@Override
	public double calc() {
		result = w * h;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("ªÔ∞¢«¸¿« ≥–¿Ã: " + result);
	}
	
	@Override
	public void show(String name) {
		calc();
		System.out.println(name + "(name) ≥–¿Ã: " + result);
	}

}