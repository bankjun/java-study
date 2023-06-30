package prob03;

public class Unit {
	private int x;
	private int y;
	
	public Unit() {
		System.out.println(getUnitName() + "이(가) 생성되었습니다.");
	}
	
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
	
//	public abstract void load();
//	public abstract void unload();
//	
//	public abstract void stimPack();
	//이걸 왜 추상메소드로 만들 수 없는건지 알아보기
	// 다운캐스팅을 하면 되긴한데 추상메소드을 부모에 만들면 모든 자식에 그 메소드들을 다 구현을 해야만 하나

}
