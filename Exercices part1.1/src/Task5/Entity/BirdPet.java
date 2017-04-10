package Task5.Entity;

import Task5.AbstractClass.Bird;

/**
 * Created by sodobescu on 3/20/2017.
 */
public class BirdPet extends Bird
{
	private int age;
	private String owner;

	public BirdPet(String name, int age, String owner) {
		super(name);
		this.age = age;
		this.owner = owner;
	}

	public BirdPet(int age, String owner) {
		super();
		this.age = age;
		this.owner = owner;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void displayInfo() {
		eat();
		MakeNoise();
		System.out.println("My owner is " + getOwner());
	}
}
