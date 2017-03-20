/**
 * Created by sodobescu on 3/20/2017.
 */
public class Equilateral extends Triangle {
	public Equilateral(double side) {
		super(side, side, side);
	}

	public Equilateral(String color, double side) {
		super(color, side, side, side);
	}
}
