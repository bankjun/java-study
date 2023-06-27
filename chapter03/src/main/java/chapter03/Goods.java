package chapter03;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public static int countOfGoods = 0; // 이렇게 static으로 만들면 클래스로 접근할수 있는 게됨, 클래스 변수, 일종의 전역 변수 *자바에는 전역변수가 없음
	// 이게 왜 필요하냐, 굳이 객체를 만들 필요가 없는 함수를 이용할때 EX)순수함수 f(x)=Y

	// public Goods() {}; => JVM이 자동으로 넣어주는 생성자
	
	public Goods() {
		Goods.countOfGoods = Goods.countOfGoods + 1;
	}
	public Goods(String name, int price, int countStock, int countSold) {
		this();
		
		this.name = name;
		this.price = price;
		this.countSold = countSold;
		this.countStock = countStock;
	}
	

	// Source -> generate getters and setters -> 로 만든 메소드들
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("가격: " + price);
		System.out.println("재고: " + countStock);
		System.out.println("판매량: " + countSold);

	}

	public int calcDiscountPirce(double discountRate) {
		return (int) (price * discountRate);
	};
	

}
