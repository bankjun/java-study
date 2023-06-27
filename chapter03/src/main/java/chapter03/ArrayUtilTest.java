package chapter03;

import java.util.Arrays;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a1 = {0,1,2,3,4};
		double[] d1 = ArrayUtil.intToDouble(a1);
		System.out.println(Arrays.toString(d1));
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3};
		int[] a2 = ArrayUtil.doubleToInt(d2);
		System.out.println(Arrays.toString(a2));
		
		int[] a3 = ArrayUtil.concat(new int [] {1,2,3,4}, new int [] {5,6,7,8});
		System.out.println(Arrays.toString(a3));
		
		// 오류: [I@76ccd017 -> 참조형 변수를 바로 출력하면 나오는 Hash 값
		// 위에 2개는 System.out.println(Arrays.toString(d1)); 이렇게 Arrays.toString(d1)를
		// 사용했는데 오류난 부분은 Arrays.toString() 를 사용하지 않고 출력함
		// 배열이라 그 위치가 레퍼런스값으로 저장되어있는 것이기 때문에 그런것임
	}

}
