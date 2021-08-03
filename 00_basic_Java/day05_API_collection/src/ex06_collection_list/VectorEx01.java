package ex06_collection_list;

import java.util.Collections;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// 초기용량, 증가용량
		// 초기 크기를 설정하고 들어온 요소의 개수가 초과하면 증가용량만큼씩 증가한다.
		Vector<Integer> vi = new Vector(3, 4);
		
		vi.add(1);
		vi.add(3);
		vi.add(10);
		vi.add(100);
		vi.add(30);
		
		Collections.sort(vi);
		System.out.println(vi);
		System.out.println(vi.size());
		System.out.println(vi.capacity());
		
		Vector<String> vs = new Vector<String>(2, 4);
		
		vs.add("키보드");
		vs.add("컵");
		vs.add("마우스");
		vs.add("키보드");
		vs.add("볼펜");
		vs.add("볼펜");
		
		System.out.println(vs);
		System.out.println(vs.get(0));
		System.out.println(vs.size());
		System.out.println(vs.capacity());
	}

}
