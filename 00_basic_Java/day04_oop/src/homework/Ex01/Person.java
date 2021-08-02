package homework.Ex01;

public class Person {
	String name;
	protected int h;
	protected int w;
	
	public Person(String name, int h, int w) {
		this.name = name;
		this.h = h;
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}