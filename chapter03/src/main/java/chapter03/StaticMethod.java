package chapter03;

public class StaticMethod {
	int n;
	static int m;
	
	//인스턴스 메소드로 인스턴스 필드 변수 불러오기
	void f1() {
		System.out.println(n);
	}
	
	// 인스턴스 메소드로 스테틱 필드 변수 호출
	void f2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략이 가능하다.
		System.out.println(m);
	}
	
	// 인스턴스 함수에서 인스턴스 함수 접근 -> 가능
	void f3() {
		f2();
	}
	
	// 클래스 메소드에서 인스턴스 필드로 접근 못함
	static void s1() {
		// 오류: 스테틱 메소드에서는인스턴스 변수에 접근할 수 없다.
		// System.out.println(n);
	}
	// 스테틱 메소드에서 스테틱 필드에 접근
	static void s2() {
		System.out.println(StaticMethod.m);
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략이 가능하다.
		System.out.println(m);
	}
	
	static void s3() {
		// 오류: 스테틱 메소드에서는 인스턴스 메소드에 접근할 수 없다.
		//f3();
	}
	// static 메소드로 스테틱 메소드 호출
	static void s4() {
		StaticMethod.s3();
		// 같은 클래스의 클래스 메소드 접근에는 클래스이름 생략이 가능하다.
	}
	// 결론: 스테틱은 스테틱만 인스턴스는 인스턴스~스테틱 다 접근가능
}
