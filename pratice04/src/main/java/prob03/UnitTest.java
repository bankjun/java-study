package prob03;

public class UnitTest {

	public static void main(String[] args) {
		
		Unit m = new Marine();
		m.move(1, 1);
		m.stop();
		((Marine)m).stimPack();
		
		Unit t = new Tank();
		t.move(2, 2);
		t.stop();
		((Tank)t).changeMode();
		
		Unit d = new DropShip();
		d.move(3, 3);
		d.stop();
		((DropShip)d).load();
		((DropShip)d).unload();
		
	}

}
