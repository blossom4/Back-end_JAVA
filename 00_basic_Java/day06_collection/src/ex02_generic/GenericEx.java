package ex02_generic;

//  Generic Class가 있으면 변수 type이 달라지더라도 매번 Class를 새로 만들 필요가 없다.
public class GenericEx<T> {
	
	// 멤버변수
	T[] v;
	
	// 멤버함수
	public void set(T[] v) {
		this.v = v;
	}
	
	public void print() {
		for (T item : v) {
			System.out.println(item);
		}
	}
}
