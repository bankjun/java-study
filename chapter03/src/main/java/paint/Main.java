package paint;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point();
		point1.setX(100);
		point1.setY(50);
		//drawPoint(point1);		
		draw(point1);
		point1.show(false);
		
		
		Point point2 = new Point(200, 150);
		//drawPoint(point2);
		draw(point2);
		point2.show(false);
		
		Point point3 = new ColorPoint();
		point3.setX(200);
		point3.setY(100);
		
		// ColorPoint point4 = (ColorPoint)point3;
		// (ColorPoint)point3.setColor("red"); 
		// . 이 우선순위라서 setcolor를 먼저 수행하고 반환된 void에 캐스팅을하는게 돼서 오류
		((ColorPoint)point3).setColor("red");
//		drawPoint(point3);
		draw(point3);
		
		Point point4 = new ColorPoint(100, 100, "blue");
		
		Rectangle rectangle = new Rectangle();
		// drawRectangle(rectangle);
		// drawShape(rectangle);
		draw(rectangle);
		
		Triangle triangle = new Triangle();
		// drawTriangle(triangle);
		// drawShape(triangle);
		draw(triangle);
		
		Circle circle = new Circle();
		// drawShape(triangle);
		draw(circle);
		
		GraphicText gt = new GraphicText("Hello World");
		draw(gt);
		
		//intanceof test
		System.out.println(circle instanceof Circle);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Drawable);
		
		// 오류: class는 hierachy(계층) 상위와 하위만 instanceof 연산자를 사용할 수 있다. 
		// System.out.println(circle instanceof Rectangle); 형제는 안됨 위아래 관계만 됨
		
		// 하지만, interface는 hierachy와 상관없이 instanceof 연산자를 사용할 수 있다.
		// 그 인터페이스가 구현이 되어있냐를 물어보는 연산자가 되는 것임
		System.out.println(circle instanceof Drawable); // True
		System.out.println(circle instanceof Runnable);	// False
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	// 이거 왜 여기따로 만듦
//	public static void drawPoint(Point pt) {
//		pt.show(true);
//	}
//	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
//	
//	public static void drawTriangle(Triangle triangle) {
//		triangle.draw();
//	}
//	
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
}
