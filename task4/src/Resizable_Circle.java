/**
 * Created by sodobescu on 3/17/2017.
 */
public class Resizable_Circle extends Circle {

	public Resizable_Circle(double a) {
		super(a);
	}

	public Resizable_Circle() {
		super(10);

	}

	public void increase(double value) {

		this.d += value;
	}

	public void decrese(double value) {

		this.d += value;
	}
}
