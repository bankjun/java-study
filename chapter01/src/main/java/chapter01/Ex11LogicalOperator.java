package chapter01;

public class Ex11LogicalOperator {

	public static void main(String[] args) {
		// !(not)
		// !T => F
		// !F => T
		System.out.println(!(3 != 2));//F
		
		//&&(and, 논리곱)
		// true && false => false
		// false && true => false
		// false && false => false
		// True && True => True
		System.out.println(3 > 2 && 3 > 4); //F
		
		//||(or, 논리합)
		// T || F => T
		// F || T => T
		// F || F => F
		// T || T => T
		System.out.println(3 != 2 || -1 > 0); // 앞이 트루니까 이미 이 연산은 무조건 트루라 왜 연산하냐고 잔소리
		
		//^(xor, 베타적 논리합)
		// T ^ F => T
		// F ^ T => T
		// F ^ F => F
		// T ^ T => F
		System.out.println(3 != 2 ^ -1 > 0); //True
	}

}
