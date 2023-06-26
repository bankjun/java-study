package chapter01;

public class Ex30Array {

	public static void main(String[] args) {
		//선언시 크기를 지정할 수 없다.
		//int [10] a;
		
		int a1[] = new int[10]; // 비추
		System.out.println(a1.length);
		
		int[] a2 = new int[10]; // 둘다 가능하지만 이걸 추천, 일관성이 있음
		System.out.println(a2.length);
		
		//초기화1
		int[] a3 = {0,1,2,3,4};
		System.out.println(a3.length);
		
		//초기화2
		
		//초기화3
	}

}
