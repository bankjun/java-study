package exception;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
		// Unchecked Exception은 예외 처리 없이 발생해야한다.
		// 왜? 예외를 보고 수정해야하는 예외라기보다는 로직 에러에 가깝기 때문이다.
		// ArrayIndexOutOfBoundsException
		// ArithmeticException
		// NullPointException
		
		
		int[] a = {1,2,3,4,5};
		
		
		for(int i =0; i <= a.length; i++) {
			System.out.println(a[i]);
		}
	}
}	
	/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at exception.UncheckedExceptionTest.main(UncheckedExceptionTest.java:9) 발생
	이건 에러 */

