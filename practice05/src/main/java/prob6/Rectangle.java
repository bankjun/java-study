package prob6;

public class Rectangle extends Shape implements Resizable {

	public Rectangle(){}
	
	public Rectangle(double w, double h){
		setWidth(w);
		setHeight(h);
	}
	
	@Override
	public void resize(double s) {
		setWidth(getWidth()*s);
		setHeight(getHeight()*s);
	}

	@Override
	double getArea() {
		return getWidth()*getHeight();
	}

	@Override
	double getPerimeter() {
		return (getWidth()+getHeight()) * 2;
	}
//커밋테스트
}
