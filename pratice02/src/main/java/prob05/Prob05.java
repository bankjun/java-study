package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		// 정답 랜덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		// System.out.println(correctNumber);
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		
		int answer = 0;
		int min = 1;
		int max = 100;
		int count = 1;
		
		while(true) {
			
			System.out.println(min + "-" + max);
			System.out.print(count + ">>");
			answer = scanner.nextInt();
			
			count++;
			
			if(answer == correctNumber) {
				System.out.println("맞았습니다.");
				break;
			}else if(answer < correctNumber) {
				System.out.println("더 높게");
				min = answer;
			}else {
				System.out.println("더 낮게");
				max = answer;
			}
		}


		scanner.close();
	}

}