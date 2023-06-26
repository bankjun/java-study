package chapter01;

import java.util.Scanner;

public class Ex32ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("상품정보를 입력하세요.");
		
		System.out.print("이름: ");
		String name = scanner.next();	//여기서 입력을 기다리면서 블락이 됨, 실행이 잠시 멈추는거지
		
		System.out.print("가격: ");
		int price = scanner.nextInt();
		
		System.out.print("재고량: ");
		int countStock = scanner.nextInt();
		
		System.out.print(name +" : "+ price + " : " + countStock);
		
		scanner.close();
		
	}

}
