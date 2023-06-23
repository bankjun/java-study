package chapter01;

public class Ex10ComparisonOperator {

	public static void main(String[] args) {
		System.out.println(3 >= 2+1);//T
		System.out.println(-1 < 0); //T
		System.out.println(3.45 < 3);//F
		System.out.println(3==2);//F
		System.out.println(3 != 2); //T
		System.out.println('a'> 'b');//F, 이건 아스키코드를 통해 비교함
	}

}
