package Day0727;

public class Rectangle extends Shape {
	private double weight;
	private double height;

	public Rectangle(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return weight * height;
	}

}
