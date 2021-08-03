package ex06_collection_list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {
	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5);
		
		v.addElement("JAVA");
		v.addElement(date);
		v.addElement(new Double(12.34));
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Enumeration enu = v.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement() + " ");
		}
		v.remove(v.indexOf("JAVA"));
		System.out.println(v);
		
		v.setElementAt(43.21, 1);
		
		System.out.println(v);
	}
}
