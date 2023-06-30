package prob3;

public abstract class Bird {
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String toString();

	public abstract void fly();

	public abstract void sing();

}
//추상클래스 추상메소드 만들고 오버라이드