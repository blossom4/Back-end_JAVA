package chapter4;

public class IfExample1 {

	public static void main(String[] args) {
		int age = 19;
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("������ �Ƶ��Դϴ�.");
		} else if (age < 14) {
			charge = 2000;
			System.out.println("�ʵ��л��Դϴ�.");
		} else if (age < 20) {
			charge = 3000;
			System.out.println("�߰����л��Դϴ�.");
		} else System.out.println("�����Դϴ�.");
		
		System.out.println("������ " + charge + "�� �Դϴ�.");
	}

}