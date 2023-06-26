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
		int[] a4 = new int[5];
		a4[0]=0;
		a4[1]=1;
		a4[2]=2;
		a4[3]=3;
		a4[4]=4;
		System.out.println(a4.length);
		//초기화3
		int[] a5 = new int[] {0,1,2,3,4};
		System.out.println(a5.length);
		
		//사용 1(값을 읽거나, 접근하거나) : 랜덤 접근
		System.out.println(a5[3]);
		
		//사용2: 순회(iteration)
		for(int i = 0; i < a5.length; i++) {
			System.out.println(a5[i]);
		}
	}
}
