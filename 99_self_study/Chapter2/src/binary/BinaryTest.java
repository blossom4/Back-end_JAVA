package binary;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10;
		int bNum = 0B1010;	// 앞에 0B를 붙이면 2진수 라는 표시
		int oNum = 012;		// 0을 붙이면 8진수
		int hNum = 0XA;		// 0X를 붙이면 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}

}
