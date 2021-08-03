package ex05_collection_set;

import java.util.TreeSet;

public class TreeSetEx03 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dear");
		set.add("elevator");
		
		System.out.println(set);
		System.out.println(set.subSet(from, to));
	}

}
