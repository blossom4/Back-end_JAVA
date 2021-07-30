// day02_basic\src\ex01\basic
package ex01.basic;

// 파일명과 클래스명이 같아야한다.
public class Hello {

	public static void main (String[] args) { // 시작점(진입점)
		// print(): 개행없이 출력
		// println(): 출력하고 개행
		// printf(): 서식에 맞춰 개행
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
// 모든 프로그램은 메모리상에 할당이 안되어있으면 사용할 수 없다.
// 제어문자 : \n, \t, \a, \b...	 (\문자)
// 출력서식: %d, %f, %c, %s... (%문자)