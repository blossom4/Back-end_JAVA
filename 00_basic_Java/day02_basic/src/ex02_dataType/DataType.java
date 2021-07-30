package ex02_dataType;

public class DataType {
	public static void main (String[] ars) {
		short sh1 = 32767;	// -32768 ~ 32767
		int iNum1 = 50000;	// ~21억 ~ 21억
		
		iNum1 = sh1;	// int = short 묵시적 형변환: 작은 데이터형이 큰 데이터형으로 자동 형변환될 수 있다.
		System.out.println(sh1);
		System.out.println(iNum1);
		
		short sh2 = 32767;
		int iNum2 = 50000;
		
		sh2 = (short)iNum2;	// short = int: 명시적 형변환: 큰 데이터형을 작은 데이터형에 넣으려하면 데이터 손실이 일어날 수 있다.
		System.out.println(sh2);
		System.out.println(iNum2);
		
		
	}
}

// 한줄 주석: Ctrl + /

/*
	여러줄 주석1: Ctrl + Shift + /
	여러줄 주석2
	여러줄 주석3
*/

/**
	document 주석
*/