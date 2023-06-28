package paint;

public class ColorPoint extends Point {
	private String color;

	public ColorPoint() {};
	// 생성자 오버로딩
	public ColorPoint(int x, int y, String color) {
//		this.x = x;
//		this.y = y;
//		이건 안됨
		//방법 1: 메소드를 통해 접근한다.
		//setX(x);
		//setY(y);
		
		// 방법 2: 명시적으로 부모의 특정 생성자를 생성한다.
		super(x,y);	// 부모호출이 뒤로 가면 오류
		this.color = color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Source -> override/implement methods -> 생성할 오버라이드 메소드 선택
	@Override // 어노테이션, 마킹(테그)같은거 
	public void show() {
		// System.out.println("점 [x=" + x + ", y=" + y + "]을 그렸습니다.");
		// 이때, 부모의 필드변수인 x,y를 사용할 수 없음 -> 변수를 private 하거나 메소드로 접근
		System.out.println("점 [x=" + getX() +
							", y=" + getY() + 
							", color=" + color +
							"]을 그렸습니다.");
	}
		
}
