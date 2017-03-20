/**
 * Created by sodobescu on 3/17/2017.
 */
public abstract  class Figure {
	protected String Color;
	private static int count;

	public Figure() {
		Color="White";
		++count;
	}

	public Figure(String color) {
		Color = color;
		++count;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}


	public  int getCount() {
		return count;
	}


	public abstract double area();
	public abstract double perimeter();


}
