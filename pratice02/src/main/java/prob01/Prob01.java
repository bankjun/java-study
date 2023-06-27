package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.print("금액: ");
		int money = scanner.nextInt();

		for(int i = 0; i < MONEYS.length; i++) {
			int m = money / MONEYS[i]; 		// m = 그 화폐 갯수
			System.out.println(MONEYS[i] + "원권:" + m + "개");
			
			money = money -(m*MONEYS[i]);	// 그 화폐를 빼고 남은 돈
		}
		scanner.close();
	}
}