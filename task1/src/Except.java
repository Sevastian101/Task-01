/**
 * Created by sodobescu on 3/20/2017.
 */

import java.io.*;

public class Except extends Exception {

	int age = 22;
	private String FirstName = "Sevastian";
	private String LastName = "Odobescu";
	Object error;

	Except(Object x) {
		error = x;
	}

	Except(int x) {

		this.age = x;
	}

	Except(String x, int type) {
		if (type == 1)
			FirstName = x;
		else LastName = x;
	}


	void prelucrare() {
		if (age < 1 || age > 120) {
			System.out.println("Sorry, but your age have to be between 1 and 120, try again!");
		}

		if (FirstName.length() <= 1 || LastName.length() <= 1) {
			System.out.println("Sorry, but your  Name is too short, try again!!");
		}

		if (FirstName.length() >= 30 || LastName.length() >= 30) {
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
