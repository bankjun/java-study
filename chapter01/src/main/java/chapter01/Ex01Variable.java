package chapter01;

public class Ex01Variable {

	public static void main(String[] args) {
		int i = 10;
		String s = "Hello"; // 원래 이런 변수가 아니라 객체를불러오는건데 자바가 이렇게 해주는거래
		
		System.out.println(i);
		System.out.println(s);
		
		System.out.println("변수 변경 로직(algolithm)");
		i = 2000;
		s = "Hello world";
				
		System.out.println(i);
		System.out.println(s);
		
		final double PI = 3.14;
		System.out.println(PI);
		
		//final이 붙은 변수(상수)는 다시 값을 대입 못한다.
		//PI = 3.1416;
	}

}
