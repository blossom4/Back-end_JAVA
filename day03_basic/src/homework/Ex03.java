package homework;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[10];		
		
		// 0 ~ 1사이의 난수를 발생시키고 10을 곱해 0 ~ 9사이의 랜덤한 숫자를 배열에 넣는다.
		for (int i = 0; i < 10; i++) {
			double dValue = Math.random();
			int iNum = (int)(dValue * 10);
			arr[i] = iNum;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 배열을 순회하면서 요소의 값을 sum에 합산한다.
		int sum = 0;
		for (int i = 0; i < 10; i++) sum += arr[i];
		
		System.out.println(sum);
	}

}
