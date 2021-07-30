// day02_basic\src\ex01\basic
package ex01.basic;

// ���ϸ�� Ŭ�������� ���ƾ��Ѵ�.
public class Hello {

	public static void main (String[] args) { // ������(������)
		// print(): ������� ���
		// println(): ����ϰ� ����
		// printf(): ���Ŀ� ���� ����
		System.out.print("print method");
		System.out.println("println method");
		
		// char = '' / str = ""
		System.out.printf("%d %f %c %s\n", 100, 12.34, 'A', "ABC");
		
		System.out.println("tab\ttab\ttab");
		System.out.print("print\nprint\nprint\n");
		
		System.out.println(100); 		   // int
		System.out.println(12.3456);	   // float 
		System.out.println("string data"); // str
		System.out.println(true); 		   // boolean
		System.out.println('A'); 		   // char
	}

}


// package > class > method > field
// ��� ���α׷��� �޸𸮻� �Ҵ��� �ȵǾ������� ����� �� ����.
// ����� : \n, \t, \a, \b...	 (\����)
// ��¼���: %d, %f, %c, %s... (%����)