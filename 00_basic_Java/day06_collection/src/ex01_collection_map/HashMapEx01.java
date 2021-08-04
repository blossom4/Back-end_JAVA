package ex01_collection_map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx01 {

	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("kosa", 2);
		map.put("name", "PePe");
		map.put("age", 29);
		map.put("classroom", "L2");
		
		System.out.println(map);
		System.out.println(map.size());
		
		// 순서가 없는것을 돌 때는 iterator를 설정하여 반복한다.
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		// iterator로 전체 요소출력
		while (it.hasNext()) {
//			System.out.println(it.next());
			
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
		Map<String, Integer> m = new HashMap();
		m.put("Youngshin", 29);
		m.put("PePe", 26);
		
		System.out.println(m);
		
		int sum = 0;
		it = m.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey() + ": " + e.getValue());
			sum += (int)e.getValue();
		}
		System.out.println("평균나이: " + (float)sum / m.size());
		
		// .values()로 value들을 분리해서 사용할 수 있다.
		Collection values = m.values();
		it = values.iterator();
		
		while (it.hasNext()) System.out.println(it.next());
		
		System.out.println(Collections.max(values));
		
		if (m.containsKey("PePe")) System.out.println("Yes");
		if (!m.containsValue(27)) System.out.println(("No"));

	}

}
