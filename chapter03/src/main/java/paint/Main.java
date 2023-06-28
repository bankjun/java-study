package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
		drawPoint(point1);
		
		point1.show(false);
		
		
		Point point2 = new Point(200, 150);
		drawPoint(point2);		
		
		point2.show(false);
	}
	// 이거 왜 여기따로 만듦
	public static void drawPoint(Point pt) {
		pt.show();
	}
}
