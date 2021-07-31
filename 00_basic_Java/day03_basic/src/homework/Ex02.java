package homework;

public class Ex02 {
	
	// 배열을 받아서 총점을 return하는 함수
	public static int getAverage(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) sum += arr[i];
		
		return sum / arr.length;
	}

	// 배열을 받아서 순위를 return하는 함수
	public static int getRank(int[] arr, int num) {
		int rank = 3;
		
		for (int i = 0; i < arr.length; i++) {
				if (num > arr[i]) rank--;
		}
		
		return rank;
	}
	
	public static void main(String[] args) {
		int[] scores = {70, 80, 90};
		
		int average = getAverage(scores);
		int rank = getRank(scores, average);

		System.out.println(average);
		System.out.println(rank);
	}

}
