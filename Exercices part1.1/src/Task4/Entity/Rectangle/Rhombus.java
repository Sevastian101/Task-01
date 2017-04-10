package Task4.Entity.Rectangle;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Rhombus extends Square {

	private double Diag1;
	private double Diag2;

	public Rhombus(double a, double diag1, double diag2) {
		super(a);
		Diag1 = diag1;
		Diag2 = diag2;
	}

	public Rhombus(String color, double a, double diag1, double diag2) {
		super(color, a);
		Diag1 = diag1;
		Diag2 = diag2;
	}

	public double getDiag1() {
		return Diag1;
	}

	public void setDiag1(double diag1) {
		Diag1 = diag1;
	}

	public double getDiag2() {
		return Diag2;
	}

	public void setDiag2(double diag2) {
		Diag2 = diag2;
	}

	@Override
	public double area() {
		return (Diag1 * Diag2);
	}

	@Override
	public double perimeter() {
		return (getA() * 4);
	}
}
