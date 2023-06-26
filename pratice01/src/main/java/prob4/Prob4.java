package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		
		// for문 사용해서 만들기
		for(int i = 0; i < text.length() ; i++) {
			System.out.println();
			for(int j = 0; j <= i; j++) {
				System.out.print(text.charAt(j));
			}
		}
		
//		System.out.println(text.length());
//		System.out.println(text.charAt(0));
//		System.out.println(text.charAt(2));
		scanner.close();
	}

}
