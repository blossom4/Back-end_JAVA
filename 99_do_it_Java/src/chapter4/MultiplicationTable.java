package chapter4;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		for (int num = 2; num < 10; num++) {
			for (int times = 1; times < 10; times++) {
				System.out.println(num + " * " + times + " = " + (num * times));
			}
			System.out.println();
		}
	}

}
