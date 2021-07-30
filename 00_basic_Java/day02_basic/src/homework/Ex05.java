package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		// ArrayList�� ���� ���ڰ� 6���� �߰��� ������ �ݺ��Ѵ�.
		while (lottoNumbers.size() < 6) {
			// 0 ~ 1 ������ ������ 46�� ���� 1 ~ 45 ���� ������ ���� ���ڸ� ��´�.
			double dValue = Math.random();
			int number = (int)(dValue * 46);
			
			// ArrayList�� �߰��Ϸ��� ���ڰ� �������� number�� �߰��Ѵ�.
			if (!lottoNumbers.contains(number)) lottoNumbers.add(number);
			else continue;
		}
		// �������� ���� �� ���
		Collections.sort(lottoNumbers);
		System.out.println(lottoNumbers);
	}
}
