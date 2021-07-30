package homework;

public class Ex15_3 {

	public static void main(String[] args) {
		// 공백과 별을 저장할 String 선언
		String line = "";
		// 5줄을 반복하면서, " "은 하나씩 줄여나가고 "*"은 하나씩 늘려나간다.
		for (int i = 0; i < 5; i++) {
			for (int j = 5 - i; j > 0; j--) {
				line += " ";
			}
			for (int k = 0; k < i + 1; k++) {
				line += "*";
			}
			// 만들어진 한 줄을 출력하고 초기화한다.
			System.out.println(line);
			line = "";
		}
	}

}
