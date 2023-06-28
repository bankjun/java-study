package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			// 입력받은걸 공백으로 구분해서 INFO에 저장
			String[] info = line.split(" ");
			
			String name = info[0];
			int price = Integer.parseInt(info[1]);
			int count = Integer.parseInt(info[2]);
			
			goods[i] = new Goods();
			goods[i].setGoods(name, price, count);
			
		}
		// 상품 출력
		for(int i =0; i < COUNT_GOODS; i++) {
			System.out.println(goods[i].getName() + "(가격: "+ goods[i].getPrice() +"원)이 " + goods[i].getCount() + "개 입고되었습니다.");
		}
		// 자원정리
		scanner.close();
	}
}
