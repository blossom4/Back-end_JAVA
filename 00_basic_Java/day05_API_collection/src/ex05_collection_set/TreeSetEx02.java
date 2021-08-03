package ex05_collection_set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx02 {

	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			
			set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}
