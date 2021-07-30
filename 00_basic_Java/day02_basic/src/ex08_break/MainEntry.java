package ex08_break;

public class MainEntry {

	public static void main(String[] args) {

		// break continue
		
		for (int i = 1; i < 11; i++) {
			if (i == 7) break;
			
			System.out.print(i);
		}
		System.out.println("\n");
		for (int i = 1; i < 11; i++) {
			if (i == 7) continue;
			
			System.out.print(i);
		}
	}

}
