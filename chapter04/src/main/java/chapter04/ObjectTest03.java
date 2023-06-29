package chapter04;

public class ObjectTest03 {

	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s2);		// 동일성 비교
		System.out.println(s1.equals(s2));	// 동질성 비교
		
		System.out.println(s1.hashCode() +" : "+ s2.hashCode()); 	// 내용기반 해싱으로 오버라이딩, 해싱값이 같음
		System.out.println(System.identityHashCode(s1)+ " : " + System.identityHashCode(s2)); // 주소기반 해싱, 해싱값이다름
		
		System.out.println("========================= 리터럴을 사용하는 경우 ==================================");
		
		// 리터럴을 사용하는 경우
		String s3 = "hello"; // new
		String s4 = "hello"; // String constant Pool(상수풀)에 이미 같은 내용이 있으면(객체의 내용기반해싱값을 가지고있음)
							 // new를 하지않고 이미있는 그 객체를 참조, 그래서 String 은 상수(불변) 
		
		System.out.println(s3 == s4);		// 동일성 비교, s4는 new가 안되었기 때문에 s3 과 s4는 동일
		System.out.println(s3.equals(s4));	// 동질성 비교
		
		System.out.println(s3.hashCode() +" : "+ s4.hashCode()); 	// 내용기반 해싱으로 오버라이딩, 해싱값이 같음
		System.out.println(System.identityHashCode(s3)+ " : " + System.identityHashCode(s4)); // 주소기반 해싱, 해싱값이 같음
		
	}

}
