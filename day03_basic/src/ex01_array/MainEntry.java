package ex01_array;

import java.util.Arrays;
import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {
		
		// 배열의 크기를 미리 지정하여 선언할 수 있다.
		// 초기화할 숫자를 정하지 않으면 기본값 0으로 된다.
		int number = 10;
		int[] arr = new int[number];
		
		// 크기가 정해진 array에 값을 넣을 때는 직접 요소를 저장한다.
		for (int i = 0; i < 10; i++) arr[i] = i;
		
		// Array를 출력하려면 toString함수를 이용한다.
		System.out.println(Arrays.toString(arr));
		
		// 크기가 정해지지 않았을 때는 ArrayList를 사용한다.
		ArrayList<Integer> arrList = new ArrayList<>();
		
		// 크기가 정해져 있지 않은 ArrayList에 요소를 추가할 때는 add()를 사용한다.
		for (int j = 0; j < 20; j++) arrList.add(j);
		
		System.out.println(arrList);
	}

}
