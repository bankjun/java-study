package prob6;

public abstract class Shape {
	private double width;
	private double height;
	
	public Shape() {}
	
	public Shape(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	abstract double getArea();
	abstract double getPerimeter();
}
