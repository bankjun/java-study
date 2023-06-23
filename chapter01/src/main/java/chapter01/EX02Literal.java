package chapter01;

/*
 * 리터럴(literal)이란 프로그램에 직접적으로 표현되는 값
 */
public class EX02Literal {

	public static void main(String[] args) {
		float f = 3.14f;	//f를 붙이면 float값이라는 것을 표현하게됨
		double d = 3.14;

		short s = 3;
		int i = 1;
		long l = 12345678901L;	//long의 값을 넘어가면? L을 붙여서 L임을 표현해주면됨
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = false;
				
		System.out.println(f);
		System.out.println(d);
		
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(c);
		System.out.println(b);

		System.out.println(bool);

	}

}
