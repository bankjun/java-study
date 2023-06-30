package prob03;

public 
class Unit {
	private int x;
	private int y;

	public String getUnitName() {
		return getClass().getName()
				.substring(7, getClass().getName().length());
	}
	
	void move(int x, int y) {
		/* 지정된 위치로 이동 */
		System.out.println(getUnitName() + "이(가) " + x + "," + y + "로 이동하였습니다.");
	}

	void stop() {
		/* 현재 위치에 정지 */
		System.out.println("현재 위치에 정지합니다.");
	}
	

}
