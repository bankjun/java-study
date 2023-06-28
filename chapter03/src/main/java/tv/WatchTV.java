package tv;

public class WatchTV {
	public static void main(String[] args) {
		TV tv = new TV(7, 20, false);

		tv.status(); // off,7, 20, 

		tv.power(true);
		tv.volume(120);
		tv.status(); // on, 7, 100

		tv.volume(false);
		tv.status(); // on, 7, 99

		tv.channel(0);
		tv.status(); // on, 1, 99

		tv.channel(true);
		tv.channel(true);
		tv.channel(true);
		tv.status(); // on, 4, 99

		tv.power(false);
		tv.status(); // off, 4, 99
	}

}
