package ex02_dataType;

public class DataType {
	public static void main (String[] ars) {
		short sh1 = 32767;	// -32768 ~ 32767
		int iNum1 = 50000;	// ~21�� ~ 21��
		
		iNum1 = sh1;	// int = short ������ ����ȯ: ���� ���������� ū ������������ �ڵ� ����ȯ�� �� �ִ�.
		System.out.println(sh1);
		System.out.println(iNum1);
		
		short sh2 = 32767;
		int iNum2 = 50000;
		
		sh2 = (short)iNum2;	// short = int: ����� ����ȯ: ū ���������� ���� ���������� �������ϸ� ������ �ս��� �Ͼ �� �ִ�.
		System.out.println(sh2);
		System.out.println(iNum2);
		
		
	}
}

// ���� �ּ�: Ctrl + /

/*
	������ �ּ�1: Ctrl + Shift + /
	������ �ּ�2
	������ �ּ�3
*/

/**
	document �ּ�
*/