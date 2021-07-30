package homework;

public class Ex14 {

	public static void main(String[] args) {
		float total = 0;
		
		for (int i = 1; i < 10; i++) total += i / (float)(i + 1);
		
		System.out.println(total);
	}

}
