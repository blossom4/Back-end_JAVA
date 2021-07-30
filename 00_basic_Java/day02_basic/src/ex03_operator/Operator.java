package ex03_operator;
	
public class Operator {
	public static void main (String[] args) {
		int x = 4, y = 7;
		
		// x = 0100 (4)
		// y = 0111 (7)
		// 	   FTFF = 0100 (4)
		// 둘다 True여야 true
		System.out.println(x & y);
		// 둘중 하나만 true여도 True
		System.out.println(x | y);
		// 두개가 같을때만 true
		System.out.println(x ^ y);
		
		boolean flag = false;
		int a = 10, b = 20, c = 30;
		
		// && 연산자는 앞의 것이 false일 경우 뒤는 수행하지 않는다.
		flag = (a < b) && (b < c);
		System.out.println(flag);
		
		flag = (a > b) && (b > c);
		System.out.println(flag);
		
		// || 연산자는 앞의 것이 true이면 뒤는 수행하지 않는다.
		flag = (a < b) || (b < c);
		System.out.println(flag);
		
		flag = (a > b) || (b > c);
		System.out.println(flag);
		
		int su = 30;
		String str = null;
		
		// 조건 ? true : false
		str = (su == 30) ? "Same" : "Different" ;
		System.out.println(str);
		
		int i, j, k;
		i = j = k = 100;
		System.out.println(i);
		
	}
}

