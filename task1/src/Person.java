import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sevastian on 19.03.2017.
 */
public class Person {


	private String FirstName;
	private String LastName;
	private int age;

	private static int population = 0;

	InputStreamReader istream = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(istream);

	public Person(int age, String FirstName, String LastName) {

		this.FirstName = FirstName;
		this.LastName = FirstName;
		this.age = age;
		Person.population++;
	}

	public Person() {
		setAge();
		setFirstName();
		setLastName();
		Person.population++;
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
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
		return FirstName;
	}

	public void setFirstName() {
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
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName() {
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
		this.LastName = LastName;
	}

	public int getPopulation() {
		return population;
	}

	public void PrintInfo() {

		System.out.println("First name:" + this.getFirstName());
		System.out.println("Last name:" + this.getLastName());
		System.out.println("Age:" + this.getAge() + " years old");
	}

	public static void main(String[] args) {

		Person A = new Person();
		Person B = new Person();
		A.PrintInfo();
		B.PrintInfo();
	}
}
