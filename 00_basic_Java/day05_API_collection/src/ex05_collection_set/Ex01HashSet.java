package ex05_collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex01HashSet {

	public static void main(String[] args) {
		// Set은 순서가 없고, 중복을 허용하지 않는다.
		// HashSet에는 primitive type은 들어갈 수 없다.
		HashSet<String> hs = new HashSet();
		hs.add("키보드");
		hs.add("컵");
		hs.add("마우스");
		hs.add("키보드");
		hs.add("볼펜");
		hs.add("볼펜");
		
		System.out.println("Hash Size = " + hs.size());
		System.out.println("HashSet = " + hs);
		
		// 순서가 없는 HashSet을 반복할 때 Iterator를 생성해서 돌아준다.
		Iterator it = hs.iterator();
		while (it.hasNext()) System.out.println(it.next());
		
		HashSet<Integer> hs2 = new HashSet();
		hs2.add(3);
		hs2.add(2);
		hs2.add(1);
		hs2.add(3);
		hs2.add(2);
		
		System.out.println("\nHash2 Size = " + hs2.size());
		System.out.println("HashSet2 = " + hs2);
		
		Iterator it2 = hs2.iterator();
		while (it2.hasNext()) System.out.println(it2.next());
	}

}
