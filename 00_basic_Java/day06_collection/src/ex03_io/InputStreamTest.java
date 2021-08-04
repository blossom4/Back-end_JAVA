package ex03_io;

public class InputStreamTest {

	public static void main(String[] args) {
		System.out.println("Input: ");
		
		try {
			int num;
			
			while ((num = System.in.read()) != -1) {
				if (num == 10 || num == 13 || num == 32) continue;
				// 113 = q, 81 = Q
				if (num == 113 || num == 81) break;
				
				char ch = (char)num;
				System.out.println(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
