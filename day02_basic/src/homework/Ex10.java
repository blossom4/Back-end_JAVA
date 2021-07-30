package homework;

public class Ex10 {

	public static void main(String[] args) {
		int sum = 0;
		int[] precipitations = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 , 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		
		for (int i = 0; i < 30; i++) sum += precipitations[i];
		
		System.out.println(sum / 30);
	}
}
