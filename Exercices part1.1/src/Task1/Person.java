package Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sevastian on 19.03.2017.
 */
public class Person {


	private String firstName;
	private String lastName;
	private int age;

	private static int population = 0;



	public Person(int age, String FirstName, String LastName) {

		this.firstName = FirstName;
		this.lastName = FirstName;
		this.age = age;
		Person.population++;
	}

	public Person() {
		readAge();
		readFirstName();
		readLastName();
		Person.population++;
	}

	public int getAge() {
		return age;
	}


	public void readAge() {
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);
		boolean check;
		int age = 0;
		do {
			try {
				try {
					check = false;
					System.out.println("Type your age:");

					age = Integer.parseInt(br.readLine());
					if (age < 1 || age > 120)
						throw new Except(age);
				} catch (NumberFormatException | IOException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void readFirstName() {
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);
		boolean check;
		String FirstName = "";
		do {
			try {
				try {
					check = false;
					System.out.println("Type your Firs Name:");

					FirstName = br.readLine();
					if (FirstName.length() <= 1 || FirstName.length() >= 30)
						throw new Except(FirstName, 1);
				} catch (NumberFormatException | IOException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);
		this.firstName = FirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void readLastName() {
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(istream);
		boolean check;
		String LastName = "";
		do {
			try {
				try {
					check = false;
					System.out.println("Type your Last Name:");

					LastName = br.readLine();
					if (LastName.length() <= 1 || LastName.length() >= 30)
						throw new Except(LastName, 2);
				} catch (NumberFormatException | IOException x) {
					throw new Except(x);
				}
			} catch (Except x) {
				check = true;
				x.prelucrare();
			}

		} while (check);
		this.lastName = LastName;
	}

	public int getPopulation() {
		return population;
	}

	public void PrintInfo() {

		System.out.println("\nFirst name:" + this.getFirstName());
		System.out.println("Last name:" + this.getLastName());
		System.out.println("Age:" + this.getAge() + " years old");
	}

}
