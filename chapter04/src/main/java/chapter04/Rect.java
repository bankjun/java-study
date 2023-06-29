package chapter04;

import java.util.Objects;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		//return Objects.hash(height, width);
		return Objects.hash(height * width);	//만약 넓이로 비교한다면
	}
	// 만약 이걸 오버라이드 안하면 Set에 자료를 넣을때 1번째로 주소기반 해싱값을 비교하기 때문에 다른값으로 생각하고 중복추가를 하게됨
	// 그래서 이걸 오버라이드 행서 내용기반 해싱값 비교를 하게끔 해야하는 것임

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rect other = (Rect) obj;
		//return height == other.height && width == other.width;
		return height * width == other.height * other.width; // 만약 넓이로 비교한다면
	}
	
	
}
