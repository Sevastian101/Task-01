package Task4.Entity.Triangles;

import Task4.AbstractClass.Figure;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Triangle extends Figure
{

	protected double sideA;
	protected double sideB;
	protected double sideC;

	public Triangle(double sideA, double sideB, double sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public Triangle(String color, double sideA, double sideB, double sideC) {
		super(color);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double perimeter() {

		return sideA + sideB + sideC;
	}

	public double area() {

		double s = (sideA + sideB + sideC) / 2;
		double Area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

		return Area;
	}


}
