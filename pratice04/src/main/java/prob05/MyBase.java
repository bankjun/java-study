package prob05;

public class MyBase extends Base {
	//이거만 건드려서 정상으로 바꾸기 코드분석먼저하고 바꿔ㅗ기 오버라이드하기
	public void service(String state) {
		if(state.equals("낮")) {
			day();
		}else if(state.equals("밤")) {
			night();
		}else {
			am();
		}
	}
	
	public void day() {
		System.out.println("낮에는 열심히 일하자");
	}
	
	public void am() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
	}
	
//	public void night() {
//		System.out.println("night");
//	}
	

}
