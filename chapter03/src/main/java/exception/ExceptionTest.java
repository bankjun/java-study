package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 10;
		int b = 10 - a;
		
		System.out.println("some code1");
		
		try {
			System.out.println("some code2");
			
			int result = (1 + 2 + 3) / b; // / by zero 예외 발생
			
			System.out.println("some code3");
			System.out.println("some code4");
		}catch(ArithmeticException ex){
			/*예외 처리*/
			
			//예외 처리는 정해져있음, 비정상적인 상황이 되었는데 더이상 뭘 하기 어려움
			
			//1. 사과
			System.out.println("미안합니다.");
			
			// 2.로깅, 어디서어떤 오류가 발생했는지 남겨놔야한다.
			System.out.println("error:" + ex);
			
			// 3. 정상적인 종료
			return;
		}finally {
			/* 코드가 정상처리가 되어도 마지막에 실행되고, 예외가 발생해도 실행됨 */
			System.out.println("자원정리");
		}
		
		
		// 예외가 발생한 이 후에 실행할 가능성이 있는 코드이기 때문에 비추
		// System.out.println("some code5");
		// catch문 밖의 코드는 좋지 못한코드, 위의 코드가 실행될것이라고 생각하고 짠 코드일 것이기 때문
	}

}
