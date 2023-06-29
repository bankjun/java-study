package chapter04;

public class ObjectTest02 {

	public static void main(String[] args) {
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// == : 두 객체의 동일성
		System.out.println(p1 == p2); // F
		System.out.println(p2 == p3); // T, p2, p3 의 레퍼런스 값이 같기 때문에 T, 결국 두개가 같은 객체냐 아니냐의 비교, 동일성 비교
									  // 두 객체속 값을 비교한것이 아님
		
		// equals : 두 객체의 동질성(내용비교, 비즈니스적 비교)
		// 			부모 클래스 Object의 기본 구현은 동일성(==) 비교와 같다. -> return (this == obj);
		//			그래서 오버라이드 해야함 근데 그때 hashCode()도 같이 오버라이드해야함 왜냐면, 내용기반 해시코드로 먼저 비교하고 그다음 내용을 비교? 
		System.out.println(p1.equals(p2));
		System.out.println(p2.equals(p3));
	}

}
