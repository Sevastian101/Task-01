package Task4;
import java.io.IOException;
/**
 * Created by sodobescu on 3/17/2017.
 */
public class Mmain {
	public static void main(String Args[]) throws IOException {
		//without polymorphism
		Task3.Entity.Square A = new Task3.Entity.Square(5);
		Task3.Entity.Circle B = new Task3.Entity.Circle("Red", 10);
		Task3.Entity.Triangle C = new Task3.Entity.Triangle("Green", 1, 1, 1);
		System.out.println("The " + A.getColor() + " Square area is:" + A.area() + " and the perimeter is:" + A.perimeter());
		System.out.println("The " + B.getColor() + " Circle area is:" + B.area() + " and the perimeter is:" + B.perimeter());
		System.out.println("The " + C.getColor() + " Triangle area is:" + C.area() + " and the perimeter is:" + C.perimeter());
		//with polymorphism
		Task3.AbstractClass.Figure[] ArrayFigure = new Task3.AbstractClass.Figure[3];
		ArrayFigure[0] = new Task3.Entity.Square(7);
		ArrayFigure[1] = new Task3.Entity.Circle("Pink", 6);
		ArrayFigure[2] = new Task3.Entity.Triangle("Green", 3, 4, 3);
		for (int i = 0; i < ArrayFigure.length; i++) {
			System.out.println("The " + ArrayFigure[i].getColor() + " Square area is:" + ArrayFigure[i].area() + " and the perimeter is:" + ArrayFigure[i].perimeter());
		}


	}
}
