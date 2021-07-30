package homework;

public class Ex15_6 {

	public static void main(String[] args) {
		String line = "";
		
		for (int i = 0; i < 5; i++) {
			// 별을 9개에서 2 * i개씩 줄여나가고 공백은 그만큼씩 늘려나간다.
			for (int j = 0; j < 2 * i; j++) line += " ";
			for (int k = 9 - 2 * i; k > 0; k--) line += "*";
			
			// 한 줄이 완성될때마다 출력하고 초기화한다.
			System.out.println(line);
			line = "";
		}
	}

}
