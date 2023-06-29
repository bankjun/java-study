package chapter04;

public class StringTest01 {

	public static void main(String[] args) {
		// 보통 유닉스에서 프로그램을 돌림
		// 유닉스의 경로 표현 -> /home/juno/dowork
		// 윈도우의 경로 표현 -> c:\home\juno\dowork
		// 근데 유닉스 식으로 코딩을 하면 유닉스에서는 그냥 되고 윈도우자바에서 사용하면 알아서 윈도우식으로 바꿔줌
		// 결론은 유닉스 식으로 경로 코딩을 하라
		
		/* 이스케이프 문자들
		  	\t : tab
			\n : newline
			\r : carrige return
			\b : beep
			\" : "
			\ : \\
		*/
		
		System.out.println("c:\\temp");
		System.out.println("c:\temp");
		System.out.println("\"hello\"");
		char c = '\'';
		System.out.println(c);
	}

}
