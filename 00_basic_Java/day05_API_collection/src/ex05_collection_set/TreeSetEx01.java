package ex05_collection_set;

import java.util.TreeSet;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {85, 96, 50, 35,45, 65, 10, 100};
		
		for (int i = 0; i < score.length; i++) {
			set.add(new Integer(score[i]));
			// set.add(score[i]
		}
		// 기준값 미만
		System.out.println(set.headSet(new Integer(50)));
		// 기준값 이상
		System.out.println(set.tailSet(new Integer(50)));
		
 
	}

}
