package prob03;
//unit클래스만들어서 상속받아서 사용하기
public class DropShip extends Unit{

//	void move(int x, int y) {
//		/* 지정된 위치로 이동 */
//	}
//
//	void stop() {
//		/* 현재 위치에 정지 */
//	}
	
	public void load() {
		/* 선택된 대상을 태운다.*/ 
		System.out.println(getUnitName() + "이(가) 선택된 유닛을 태웁니다.");
	}
	
	
	public void unload() {
		/* 선택된 대상을 내린다.*/
		System.out.println(getUnitName() + "이(가) 선택된 유닛을 내립니다.");
	}
}