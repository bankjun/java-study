package tv;

public class TV {
	private int channel;	// 1-255
	private int volume;		// 1-100, 만약 200을 넣으면 100되게
	private boolean power;	

	public TV() {}
	
	public TV(int channel, int volume, boolean power) {
		channel(channel);
		volume(volume);
		power(power);
	}

	
	public void power(boolean on) {
		if(on) {
			power = true;
		}else {
			power = false;
		}
	}

	public void volume(int volume) {
		// 숫자 지정
		if(volume > 100) {
			volume = 100;
		}else if(volume < 1) {
			volume = 1;
		}
		
		this.volume = volume;
		
	}
	// 1씩 증감, T일때 증가 - F일때 감소
	public void volume(boolean up) {
		if(up) {
			volume++;
			if(volume > 100) {
				volume = 1;
			}
		}
		else {
			volume--;
			if(volume < 1) {
				volume = 100;
			}
		}
	}

	public void channel(int channel) {
		
		if(channel > 255) {
			channel = 255;
		}else if(channel < 1) {
			channel = 1;
		}
		this.channel = channel;
	}

	public void channel(boolean up) {
		if(up) {
			channel++;
			if(channel > 255) {
				channel = 1;
			}
		}else {
			channel--;
			if(channel < 1) {
				channel = 255;
			}
		}
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
