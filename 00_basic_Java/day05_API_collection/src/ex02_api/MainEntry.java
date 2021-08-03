package ex02_api;

public class MainEntry {

	public static void main(String[] args) {
		String str = "abc";
		System.out.println("str = " + str);
		
		int x = 3, y = 3;
		System.out.println("x = " + x + " y = " + y);
		System.out.println(str.hashCode());
		
		// == �����ڷ� ���ϸ� �ּҰ� �������� ����.
		// ���� inprimitive �� ������ .equals()�� ���ؾ��Ѵ�.
		// .equalsIgnoreCase()�� ���ϸ� ��ҹ��ڸ� �����ϰ� �����ش�.
		String s1 = new String("korea");
		String s2 = new String("korea");
		String s3 = "korea";
		String s4 = "korea";
		
		System.out.println("\nstr");
		System.out.println("new String");
		if (s1 == s2) System.out.println(true);
		else System.out.println(false);
		System.out.println("hashcode()");
		if(s3.hashCode() == s4.hashCode()) System.out.println(true);
		else System.out.println(false);
			
		System.out.println("\nint");
		if (x == y) System.out.println(true);
		else System.out.println(false);
		
		System.out.println("\nStringBuffer");
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.length() + " " + sb.capacity());
		System.out.println(sb.hashCode());
	}

}
