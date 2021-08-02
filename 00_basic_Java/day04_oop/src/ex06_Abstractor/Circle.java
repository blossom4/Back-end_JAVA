package ex06_Abstractor;

public class Circle extends Shape {
	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}
	
	@Override
	public void draw() {
		calc();
		System.out.println("ø¯¿« ≥–¿Ã: " + result);
	}
	
	@Override
	public void show(String name) {
		calc();
		System.out.println(name + "(name) ≥–¿Ã: " + result);
	}

}
