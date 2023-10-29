package test01;

public class CoinExchange {

	public static void main(String[] args) {
		// 입력된 금액을 가상의 동전 600원/150원/10원으로 구성된  최소 동전 개수를 구하는 프로그램
		int money = 7600;
		int[] unit = {600, 150, 10};
		int[] count = new int[unit.length];
		
		System.out.println("보유 금액: " + money);
		
		for(int i = 0; i <unit.length; i++) {
			System.out.println(unit[i] + "원: " + money/unit[i] + "개");
			count[i] = money/unit[i];
			System.out.println("남은 금액: " + money%unit[i] + "원");
			money %= unit[i];
		}
		
		System.out.println("===========================");
		System.out.println("최소 동전의 갯수: ");
		
		for(int i = 0; i < unit.length; i++) {
			System.out.println(unit[i]+ "원 " + count[i] + "개");
		}
	}
}

