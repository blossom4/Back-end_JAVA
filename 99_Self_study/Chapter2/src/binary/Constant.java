package binary;

public class Constant {

	public static void main(String[] args) {
		// final로 선언하면 상수이고 값이 변하지 않는다.
		final int MAX_NUM = 100;
		final float PI = 3.14f;
		
		final int STUDENT_NUM = 30;
		
		
		int num = 30;
		if (num == STUDENT_NUM ) {
			System.out.println("same");
		}
		
		System.out.println(STUDENT_NUM);
	}

}
