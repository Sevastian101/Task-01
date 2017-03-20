/**
 * Created by sodobescu on 3/17/2017.
 */
public class Rectangle extends Square {
	private double l1;
	private double l2;

	public Rectangle(String color, double a, double l1, double l2) {
		super(color, a);
		this.l1 = l1;
		this.l2 = l2;
	}

	public Rectangle(double a, double l1, double l2) {
		super(a);
		this.l1 = l1;
		this.l2 = l2;
	}

	public double getL1() {
		return l1;
	}

	public void setL1(double l1) {
		this.l1 = l1;
	}

	public double getL2() {
		return l2;
	}

	public void setL2(double l2) {
		this.l2 = l2;
	}

	@Override
	public double perimeter() {
		return ((l1 + l2) * 2);
	}

	@Override
	public double area() {
		return (l1 * l2);
	}
}
