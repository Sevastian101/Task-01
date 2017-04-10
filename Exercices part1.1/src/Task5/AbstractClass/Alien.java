package Task5.AbstractClass;

import Task5.Interfaces.Animal;

/**
 * Created by sodobescu on 3/20/2017.
 */
public abstract class Alien implements Animal
{
	protected String Name;

	public Alien() {
		Name = "Galadon";
	}

	public Alien(String name) {
		Name = name;
	}

	public void eat() {
		System.out.println("Alien " + this.getName() + " is eating");
	}

	public void MakeNoise() {
		System.out.println("UUUUUHUHHHHAAAA you are gonna be mine!");
	}

	public abstract void fight();

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
}
