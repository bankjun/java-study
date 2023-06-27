package prob05;

import java.util.Scanner;

public class prob05Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		char retry = sc.next().charAt(0);
		
		
		// char retry = scanner.nextLine().charAt(0);
		
		String comp = sc.next();
		if (comp.equals("n")) {
		System.out.print("비교가 된다 ");
		}
		System.out.println();

	}

}
