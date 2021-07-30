package homework;

public class Ex15_5 {

	public static void main(String[] args) {
		String line = "";
		// 5줄을 만든다.
		for (int i = 1; i < 6; i++) {
			// 2n - 1만큼씩 별의 개수가 늘어나고, 반대로 공백은 별을 중심으로
			// 양옆에 각각 최대길이 - (2n - 1)만큼씩 공백이 줄어든다.
			for (int j = 0; j < (10 - 2 * i) / 2; j++) line += " ";
			for (int k = 0; k < 2 * i - 1; k++) line += "*";
			for (int j = 0; j < (10 - 2 * i) / 2; j++) line += " ";
			
			// 한 줄이 완성되면 출력하고 초기화한다.
			System.out.println(line);
			line = "";
		}
	}

}
