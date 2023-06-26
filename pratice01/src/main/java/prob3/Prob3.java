package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("숫자를 입력하세요 (그만하기 = 0 ): ");
			int number = scanner.nextInt();
			int sum = 0;
			
			if(number % 2 == 1) {//홀수
				for(int i = 0; i <= number; i++) {
					if(i % 2 == 1) {
						sum += i;
					}
				}
			}
			else if(number == 0) {// 그만하기
				break;
			}
			else if(number % 2 == 0) {//짝수
				for(int i = 0; i <= number; i++) {
					if(i % 2 == 0) {
						sum += i;
					}
				}
			}
			System.out.println("결과값: " + sum);
		}
		
		//scanner.close();
	}
}
