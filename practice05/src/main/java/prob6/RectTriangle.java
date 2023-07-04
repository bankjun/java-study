package prob6;

public class RectTriangle extends Shape {
	public RectTriangle() {}
	
	public RectTriangle(double w, double h) {
		setWidth(w);
		setHeight(h);
	}
	
	@Override
	public double getArea() { // 넓이 
		return (getWidth()*getHeight())/2 ;
	}
	
	@Override
	public double getPerimeter() { // 둘레 
		return getWidth() + getHeight() + Math.sqrt(getWidth()*getWidth() + getHeight()*getHeight());
	}
	
	//직각 삼각형 둘레 h + w + Math.sqrt(w*w + h*h)
}
