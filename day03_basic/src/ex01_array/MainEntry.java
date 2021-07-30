package ex01_array;

import java.util.Arrays;
import java.util.ArrayList;

public class MainEntry {

	public static void main(String[] args) {
		
		// �迭�� ũ�⸦ �̸� �����Ͽ� ������ �� �ִ�.
		// �ʱ�ȭ�� ���ڸ� ������ ������ �⺻�� 0���� �ȴ�.
		int number = 10;
		int[] arr = new int[number];
		
		// ũ�Ⱑ ������ array�� ���� ���� ���� ���� ��Ҹ� �����Ѵ�.
		for (int i = 0; i < 10; i++) arr[i] = i;
		
		// Array�� ����Ϸ��� toString�Լ��� �̿��Ѵ�.
		System.out.println(Arrays.toString(arr));
		
		// ũ�Ⱑ �������� �ʾ��� ���� ArrayList�� ����Ѵ�.
		ArrayList<Integer> arrList = new ArrayList<>();
		
		// ũ�Ⱑ ������ ���� ���� ArrayList�� ��Ҹ� �߰��� ���� add()�� ����Ѵ�.
		for (int j = 0; j < 20; j++) arrList.add(j);
		
		System.out.println(arrList);
	}

}
