package chapter01;

public class Ex09ArithmaticOperator {

	public static void main(String[] args) {
		System.out.println(10. / 3.);//double
		System.out.println(10. / 3); //double
		System.out.println(10 / 3.); //double
		System.out.println(10 / 3);	 //int
		
		System.out.println((double)10 / 3);		//10을 더블형으로 만들고 나눈거
		System.out.println((double)(10 / 3));	// 결과자체를 더블형으로 바꾼거
		
		System.out.println(44 % 3); // 2
		System.out.println(-7 % 3); //-1
		System.out.println(7 % -3); // 1
	}

}
