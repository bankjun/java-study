package tv;

public class TV {
	private int channel;	// 1-255
	private int volume;		// 1-100, 만약 200을 넣으면 100되게
	private boolean power;	

	public void power(boolean on) {

	}

	public void volume(int volume) {
		// 1씩증가시키고 1씩 감소시킬 수 있고
		// 숫자를 지정해서 할 수 있음
	}

	public void volume(boolean up) {

	}

	public void channel(int channel) {

	}

	public void channel(boolean up) {

	}
	
	public void status() {
//		String s = null;
//		if(power) {
//			s = "on";
//		}else {
//			s = "off";
//		}
		
		// 위 아래 가 같은 의미임, 
		
//		(power? "on" : "off")

		System.out.println("TV[power=" + (power? "on" : "off") + " , channel=" + channel + ", volume=" + volume);
	}
	
}
