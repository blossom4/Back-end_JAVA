package homework;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("Abraham", 90);
		map.put("Bona", 99);
		map.put("Collin", 75);
		map.put("Daniel", 87);
		map.put("Eve", 89);
		
		System.out.println("Map List");
		System.out.println(map + "\n");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		Collection values = map.values();
		
		System.out.println("Students: " + map.size());
		
		int sum = 0;
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(e.getKey());
			sum += (int)e.getValue();
		}
		
		System.out.println("\nTotal: " + sum + " Average: " + (float)(sum / map.size()));
		System.out.println("Max Score: " + Collections.max(values) + " Min Score: " + Collections.min(values));
		
	}
}
