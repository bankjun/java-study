package chapter04;

public class StringTest02 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();	// 새로 만들어진 객체를 s2가 참조하도록 한 코드
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);	// s1이 변하는 것이 아니라, 새로운 객체를 만들고 그것을 return하는 것
		
		String s4 = s2.concat("??"); // s2객체 + ??객체(임시생성) -> s2?? 객체만들고 s4가 참조
		String s5 = "!".concat(s2).concat("@"); //
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		
		//그림을 그려보자
		
		String s6 = "Hello";
		System.out.println(equalsHello(s6));
	}
	public static boolean equalsHello(String s) {
		//return s.equals("Hello");
		return "Hello".equals(s);
	}
}
