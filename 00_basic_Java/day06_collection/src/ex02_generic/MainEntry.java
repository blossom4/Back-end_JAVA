package ex02_generic;

public class MainEntry {

	public static void main(String[] args) {
		//  Generic Class가 있으면 변수 type이 달라지더라도 매번 Class를 새로 만들 필요가 없다.
		
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
