package ex03_operator;
	
public class Operator {
	public static void main (String[] args) {
		int x = 4, y = 7;
		
		// x = 0100 (4)
		// y = 0111 (7)
		// 	   FTFF = 0100 (4)
		// �Ѵ� True���� true
		System.out.println(x & y);
		// ���� �ϳ��� true���� True
		System.out.println(x | y);
		// �ΰ��� �������� true
		System.out.println(x ^ y);
		
		boolean flag = false;
		int a = 10, b = 20, c = 30;
		
		// && �����ڴ� ���� ���� false�� ��� �ڴ� �������� �ʴ´�.
		flag = (a < b) && (b < c);
		System.out.println(flag);
		
		flag = (a > b) && (b > c);
		System.out.println(flag);
		
		// || �����ڴ� ���� ���� true�̸� �ڴ� �������� �ʴ´�.
		flag = (a < b) || (b < c);
		System.out.println(flag);
		
		flag = (a > b) || (b > c);
		System.out.println(flag);
		
		int su = 30;
		String str = null;
		
		// ���� ? true : false
		str = (su == 30) ? "Same" : "Different" ;
		System.out.println(str);
		
		int i, j, k;
		i = j = k = 100;
		System.out.println(i);
		
	}
}

