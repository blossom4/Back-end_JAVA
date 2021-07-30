package homework;

public class Ex15_1 {

	public static void main(String[] args) {
		String stars = "*";
		// 그릴 별의 개수를 하나씩 추가해나간다.
		for (int i = 0; i < 5; i++) {
			System.out.println(stars);
			stars += "*";
		}
	}
}
