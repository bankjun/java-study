package prob03;

public class UnitTest {

	public static void main(String[] args) {
		Unit c = new Unit();
		c.move(0, 0);
		c.stop();
		
		Marine m = new Marine();
		m.move(1, 1);
		m.stop();
		m.stimPack();
		
		Tank t = new Tank();
		t.move(2, 2);
		t.stop();
		t.changeMode();
		
		DropShip d = new DropShip();
		d.move(3, 3);
		d.stop();
		d.load();
		d.unload();
		
	}

}
