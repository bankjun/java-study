package prob05;

public class Prob05 {

	public static void main(String[] args) {
		Base base = new MyBase();

		base.service("낮");	// 낮에는 열심히 일하자
		base.service("밤");	// night
		base.service("오후");// 오후도 낮과 마찬가지로 일해야 합니다.
	}
}
