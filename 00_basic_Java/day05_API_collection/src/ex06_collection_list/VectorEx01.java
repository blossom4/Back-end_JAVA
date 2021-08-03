package ex06_collection_list;

import java.util.Collections;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// �ʱ�뷮, �����뷮
		// �ʱ� ũ�⸦ �����ϰ� ���� ����� ������ �ʰ��ϸ� �����뷮��ŭ�� �����Ѵ�.
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
		
		vs.add("Ű����");
		vs.add("��");
		vs.add("���콺");
		vs.add("Ű����");
		vs.add("����");
		vs.add("����");
		
		System.out.println(vs);
		System.out.println(vs.get(0));
		System.out.println(vs.size());
		System.out.println(vs.capacity());
	}

}
