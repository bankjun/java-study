package paint;

public class Main {

	public static void main(String[] args) {
		Point point = new Point();
		point.setX(100);
		point.setY(50);
		drawPoint(point);
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);
	}
	// 이거 왜 여기따로 만듦
	public static void drawPoint(Point pt) {
		pt.show();
	}
}
