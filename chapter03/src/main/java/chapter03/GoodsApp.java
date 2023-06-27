package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera = new Goods();
		System.out.println("상품갯수: " + Goods.countOfGoods);
		camera.setName("nikon");
		camera.setPrice(400000);
		camera.setCountStock(30);
		camera.setCountSold(50);

		camera.showInfo();

//		System.out.println("이름: " + camera.getName());
//		System.out.println("가격: " + camera.getPrice());
//		System.out.println("재고: " + camera.getCountStock());
//		System.out.println("판매량: " + camera.getCountSold());
		
		int discountPrice = camera.calcDiscountPirce(0.5);
		System.out.println(discountPrice);
		
		Goods goods2 = new Goods();
		System.out.println("상품갯수: " + Goods.countOfGoods);

		Goods goods3 = new Goods();
		System.out.println("상품갯수: " + Goods.countOfGoods);
	}

}
