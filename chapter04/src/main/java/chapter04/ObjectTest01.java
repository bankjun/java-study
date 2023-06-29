package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);

		Class klass = p.getClass();
		System.out.println(klass);
		
		System.out.println(p.getClass()); // reflection
		
		System.out.println(p.hashCode()); 	/* address 기반의 해싱값, 해싱 = integer(정수값) , 10진수의 해싱값
											   배열, 문자등 다양한 자료형을 다 정수값으로 표현해놓은 것 => 해싱 
											   address? X 
											   reference? X*/
		
		System.out.println(p.toString());	/* getClass() + "@" + hashCode() -> 16진수의 해싱값
											 getClass().getName() + "@" + Integer.toHexString(hashCode()); */
		System.out.println(p);		//  
		
		
	}

}
