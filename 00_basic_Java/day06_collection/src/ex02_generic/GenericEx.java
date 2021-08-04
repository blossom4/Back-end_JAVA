package ex02_generic;

//  Generic Class�� ������ ���� type�� �޶������� �Ź� Class�� ���� ���� �ʿ䰡 ����.
public class GenericEx<T> {
	
	// �������
	T[] v;
	
	// ����Լ�
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}
}
