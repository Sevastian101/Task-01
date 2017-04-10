package Task4.Entity.Circle;

import Task4.Intefaces.Resizable;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Resizable_Circle extends Circle implements Resizable{

	public Resizable_Circle(double a) {
		super(a);
	}

	public Resizable_Circle() {
		super(10);

	}

	public void increase(double value) {

		this.d += value;
	}

	public void decrease(double value) {

		this.d += value;
	}
}
