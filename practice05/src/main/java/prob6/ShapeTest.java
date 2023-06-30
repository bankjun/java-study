package prob6;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		List<Shape> list = new ArrayList<Shape>();
		
		list.add( new Rectangle(5, 6) );
		list.add( new RectTriangle( 6, 2) );//직각삼각형
		
		for( Shape shape : list ) {
			System.out.println( "area:" + shape.getArea() );
			System.out.println( "perimeter:" + shape.getPerimeter() );//둘레
			
			if( shape instanceof Resizable ) {
				Resizable resizable = (Resizable) shape;
				resizable.resize( 0.5 );
				System.out.println( "new area:" + shape.getArea() );
				System.out.println( "new perimeter:" + shape.getPerimeter() );
			}
		}
	}
}
//직각 삼각형 둘레 h + w + Math.sqrt(w*w + h*h)