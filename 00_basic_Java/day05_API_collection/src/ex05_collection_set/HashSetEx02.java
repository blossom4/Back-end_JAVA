package ex05_collection_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx02 {
	public static void main(String[] args) {
		
		// new Integer(1)�� "1"�� �ٸ� �ּҿ� ����Ǿ� �ִ�.
		Object[] objArr = {"1", new Integer(1), "2", "3", "4", "4", "4" };
		
		Set  set = new HashSet();
		
		for(int i = 0; i < objArr.length ;  i++ ) {
				set.add( objArr[i] );
		}
		
		System.out.println(set);
	}
}
