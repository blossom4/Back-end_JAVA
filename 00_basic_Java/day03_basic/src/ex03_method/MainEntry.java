package ex03_method;

public class MainEntry {
	
	public void display() { // instance method - object create
		System.out.println("none static display() called");
	}

	public static void main(String[] args) { // ������. ���ο��� �׻� ���� �����Ѵ�.
		System.out.println("main call ");
		show();
		
		// display(); �� �ϸ� ������ �߻��Ѵ�. 
		// Error - Cannot make a static reference to the non-static method display() from the type MainEntry
		MainEntry me = new MainEntry(); // ��ü�� �����ؼ� �޸𸮿� �Ҵ��ϰ�, �������Լ��� �ڵ�ȣ���Ѵ�.
		me.display();
		
		line();
		line("222222222222222222222222222");
		line("3", 20);
		System.out.println("main finished "); // ���ο��� �����ϰ� ���ο��� ������.
	}
	
	// �Ű����� ����, ����Ÿ�Ե� ���� ���
	public static void show() { // static method
		System.out.println("static show() called");
	}
	
	public static void line() { // static method
		System.out.println("1111111111111111111111111111111");
		
	}
	
	public static void line(String str) { // static method
		System.out.println(str);
		
	}
	
	public static void line(String str, int n) { // static method
		for (int i = 0; i < n; i++) System.out.print(str);
		
		System.out.println();
		
	}

}
