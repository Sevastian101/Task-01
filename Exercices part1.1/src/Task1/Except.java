package Task1; /**
 * Created by sodobescu on 3/20/2017.
 */
import java.io.*;
public class Except extends Exception {

	int age = 22;
	private String firstName = "Sevastian";
	private String lastName = "Odobescu";
	Object error;

	Except(Object x) {
		error = x;
	}

	Except(int age) {this.age = age;}

	Except(String name, int type) {
		if (type == 1)
			firstName = name;
		else lastName = name;
	}
	public void prelucrare() {
		if (age < 1 || age > 120) {
			System.out.println("Sorry, but your age have to be between 1 and 120, try again!");
		}
		if (firstName.length() <= 1 || lastName.length() <= 1) {
			System.out.println("Sorry, but your  Name is too short, try again!!");
		}
		if (firstName.length() >= 30 || lastName.length() >= 30) {
			System.out.println("Sorry, but your  Name is too long, try again!!");
		}
		if (error instanceof IOException) {
			System.out.println("An integer is required!");
		}
		if (error instanceof NumberFormatException) {
			System.out.println("An integer is required!");
		}
	}
}
