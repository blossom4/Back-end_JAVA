package ex02_generic;

public class MainEntry {

	public static void main(String[] args) {
		//  Generic Class�� ������ ���� type�� �޶������� �Ź� Class�� ���� ���� �ʿ䰡 ����.
		
		GenericEx<String> t1 = new GenericEx<String>();
		String[] str = {"abc", "def", "ghi"};
		t1.set(str);
		t1.print();
		
		System.out.println();
		GenericEx<Integer> t2 = new GenericEx<Integer>();
		Integer[] num = {1, 2, 3, 4};
		t2.set(num);
		t2.print();
	}

}
