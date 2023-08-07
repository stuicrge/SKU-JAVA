package Day0727;

public class Triangle extends Shape {

	private double weight;
	private double height;

	public Triangle(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (weight * height) / 2;
	}

}
