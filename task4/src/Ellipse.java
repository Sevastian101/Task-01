/**
 * Created by sodobescu on 3/17/2017.
 */
public class Ellipse extends Circle {

	private double a;
	private double b;

	public Ellipse(double d, double a, double b) {
		super(d);
		this.a = a;
		this.b = b;
	}

	public Ellipse(String color, double d, double a, double b) {
		super(color, d);
		this.a = a;
		this.b = b;
	}


	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}


	@Override
	public double area() {
		return (a + b / 2);
	}

	@Override
	public double perimeter() {
		return a + b;
	}
}
