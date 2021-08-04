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
		
		// ������ ���°��� �� ���� iterator�� �����Ͽ� �ݺ��Ѵ�.
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		// iterator�� ��ü ������
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
		System.out.println("��ճ���: " + (float)sum / m.size());
		
		// .values()�� value���� �и��ؼ� ����� �� �ִ�.
		Collection values = m.values();
		it = values.iterator();
		
		while (it.hasNext()) System.out.println(it.next());
		
		System.out.println(Collections.max(values));
		
		if (m.containsKey("PePe")) System.out.println("Yes");
		if (!m.containsValue(27)) System.out.println(("No"));

	}

}
