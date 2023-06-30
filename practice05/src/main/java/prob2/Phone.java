package prob2;

public class Phone {
	public void execute( String function ) {
		call();
	}
	//이걸 오버라이드 하는문제 이건 건드는거 아님
	
	private void call(){
		System.out.println( "통화기능시작" );
	}
}
