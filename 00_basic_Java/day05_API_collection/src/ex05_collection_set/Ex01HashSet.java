package ex05_collection_set;

import java.util.HashSet;
import java.util.Iterator;

public class Ex01HashSet {

	public static void main(String[] args) {
		// Set�� ������ ����, �ߺ��� ������� �ʴ´�.
		// HashSet���� primitive type�� �� �� ����.
		HashSet<String> hs = new HashSet();
		hs.add("Ű����");
		hs.add("��");
		hs.add("���콺");
		hs.add("Ű����");
		hs.add("����");
		hs.add("����");
		
		System.out.println("Hash Size = " + hs.size());
		System.out.println("HashSet = " + hs);
		
		// ������ ���� HashSet�� �ݺ��� �� Iterator�� �����ؼ� �����ش�.
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
