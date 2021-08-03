package ex06.collection.list;

import java.util.*;

//List : 순서있고, 중복허용한다

public class ArrayListEx4 {
	public static void main(String[] args) {	
		//ArrayList<String> list = new ArrayList<String>();
		List list = new ArrayList<String>();
		list.add("사과");		list.add("배");		list.add("파인애플");
		list.add("토마토");		list.add("사과");
		
		System.out.println("요소 개수 : " + list.size()); // 5
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
