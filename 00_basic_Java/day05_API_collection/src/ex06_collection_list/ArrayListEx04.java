package ex06.collection.list;

import java.util.*;

//List : �����ְ�, �ߺ�����Ѵ�

public class ArrayListEx4 {
	public static void main(String[] args) {	
		//ArrayList<String> list = new ArrayList<String>();
		List list = new ArrayList<String>();
		list.add("���");		list.add("��");		list.add("���ξ���");
		list.add("�丶��");		list.add("���");
		
		System.out.println("��� ���� : " + list.size()); // 5
		System.out.println("-------------iterator() method ----------------");
		Iterator it = list.iterator();
		while( it.hasNext() ) {
			System.out.println(it.next());
		}
		
		System.out.println("-------------get() method ----------------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println( list.get(i));
		}
	}
}
