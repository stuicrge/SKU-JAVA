package Day0727;

public class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;

	}

	@Override
	public double getArea() {

		return radius * radius;
	}

}
