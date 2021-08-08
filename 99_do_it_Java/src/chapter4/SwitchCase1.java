package chapter4;

public class SwitchCase1 {

	public static void main(String[] args) {
		int rank = 2;
		String medalColor;
		
		switch (rank) {
			case 1: medalColor = "Gold";
				break;
			case 2: medalColor = "Silver";
				break;
			case 3: medalColor = "Bronze";
				break;
			default: medalColor = "None";
		}
		
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + " 입니다.");
	}

}
