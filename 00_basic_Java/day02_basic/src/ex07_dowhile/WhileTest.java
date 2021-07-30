package ex07_dowhile;

public class WhileTest {

	public static void main(String[] args) {

		// for
		System.out.println("for");
		for (int i = 1; i <11; i++) System.out.print(i + " ");
		
		// while
		System.out.println("\n\nwhile");
		int j = 1;
		while (j < 11) {
			System.out.print(j + " ");
			j++;
		}
		
		// do - while
		System.out.println("\n\ndo while");
		int k = 1;
		do {
			System.out.print(k + " ");
			k++;
		} while (k < 11);
	}
}
