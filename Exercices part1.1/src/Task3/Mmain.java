package Task3;
import Task3.AbstractClass.Figure;
import Task3.Entity.Circle;
import Task3.Entity.Square;
import Task3.Entity.Triangle;

import java.io.IOException;

/**
 * Created by sodobescu on 3/17/2017.
 */
public class Mmain {
	public static void main(String Args[]) throws IOException {

		//without polymorphism
		Square A = new Square(5);
		Circle B = new Circle("Red", 10);
		Triangle C = new Triangle("Green", 1, 1, 1);
		System.out.println("The " + A.getColor() + " Square area is:" + A.area() + " and the perimeter is:" + A.perimeter());
		System.out.println("The " + B.getColor() + " Circle area is:" + B.area() + " and the perimeter is:" + B.perimeter());
		System.out.println("The " + C.getColor() + " Triangle area is:" + C.area() + " and the perimeter is:" + C.perimeter());
		//with polymorphism
		Figure[] ArrayFigure = new Figure[3];
		ArrayFigure[0] = new Square(7);
		ArrayFigure[1] = new Circle("Pink", 6);
		ArrayFigure[2] = new Triangle("Green", 3, 4, 3);
		for (int i = 0; i < ArrayFigure.length; i++) {
			System.out.println("The " + ArrayFigure[i].getColor() + " Square area is:" + ArrayFigure[i].area() + " and the perimeter is:" + ArrayFigure[i].perimeter());
		}


	}
}
