package Task3.Entity;

import Task3.AbstractClass.Figure;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Square extends Figure
{
	private double a;

	public Square(double a) {
		super();
		this.a = a;
	}

	public Square(String color, double a) {
		super(color);
		this.a = a;
	}

	public double perimeter() {

		return a * 4;
	}

	public double area() {
		return Math.pow(a, 2);
	}


}

