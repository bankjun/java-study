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
		
		Point point3 = new ColorPoint();
		point3.setX(200);
		point3.setY(100);
		
		// ColorPoint point4 = (ColorPoint)point3;
		// (ColorPoint)point3.setColor("red"); 
		// . 이 우선순위라서 setcolor를 먼저 수행하고 반환된 void에 캐스팅을하는게 돼서 오류
		((ColorPoint)point3).setColor("red");
		drawPoint(point3);
		
		Point point4 = new ColorPoint(100, 100, "blue");
	}
	// 이거 왜 여기따로 만듦
	public static void drawPoint(Point pt) {
		pt.show(true);
	}
	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
}
