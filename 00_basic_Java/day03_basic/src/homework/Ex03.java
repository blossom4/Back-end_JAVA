package homework;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		int[] arr = new int[10];		
		
		// 0 ~ 1������ ������ �߻���Ű�� 10�� ���� 0 ~ 9������ ������ ���ڸ� �迭�� �ִ´�.
		for (int i = 0; i < 10; i++) {
			double dValue = Math.random();
			int iNum = (int)(dValue * 10);
			arr[i] = iNum;
		}
		
		System.out.println(Arrays.toString(arr));
		
		// �迭�� ��ȸ�ϸ鼭 ����� ���� sum�� �ջ��Ѵ�.
		int sum = 0;
		for (int i = 0; i < 10; i++) sum += arr[i];
		
		System.out.println(sum);
	}

}
