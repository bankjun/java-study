package prob05;

import java.util.Scanner;

public class prob05Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 하나 입력받기(y/n): ");
		char comp1 = sc.next().charAt(0);
		if(comp1 == 'y') {
			System.out.println(".next() 메소드로 문자입력을 받아 비교연산자로 문자를 비교해 같으면 출력되는 메시지");
		}
		
		System.out.print("문자열 하나 입력받기(y/n): ");
		
		char retry = sc.nextLine().charAt(0);
		
		String comp = sc.next();
		if (comp.equals("n")) {
		System.out.print("비교가 된다 ");
		}
		System.out.println();

	}

}
