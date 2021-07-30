package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex05 {
	public static void main(String[] args) {
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		// ArrayList에 랜덤 숫자가 6개가 추가될 때까지 반복한다.
		while (lottoNumbers.size() < 6) {
			// 0 ~ 1 사이의 난수에 46을 곱해 1 ~ 45 범위 내에서 랜덤 숫자를 얻는다.
			double dValue = Math.random();
			int number = (int)(dValue * 46);
			
			// ArrayList에 추가하려는 숫자가 없을때만 number를 추가한다.
			if (!lottoNumbers.contains(number)) lottoNumbers.add(number);
			else continue;
		}
		// 오름차순 정렬 후 출력
		Collections.sort(lottoNumbers);
		System.out.println(lottoNumbers);
	}
}
