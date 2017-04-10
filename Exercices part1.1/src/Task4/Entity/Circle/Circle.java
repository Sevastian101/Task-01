package Task4.Entity.Circle;

import Task4.AbstractClass.Figure;
import Task4.Intefaces.Shape;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Circle extends Figure implements Shape
{
	protected double d;

	public Circle(double d) {
		super();
		this.d = d;
	}

	public Circle(String color, double d) {
		super(color);
		this.d = d;
	}

	public double getD() {
		return d;
	}

	public void setD(double d) {
		this.d = d;
	}


	public double perimeter() {

		return 2 * Math.PI * (d / 2);
	}

	public double area() {
		return (Math.PI) * Math.pow(d / 2, 2);
	}


}
