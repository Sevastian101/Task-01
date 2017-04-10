package Task5.Entity;

import Task5.Interfaces.Cat;

/**
 * Created by sodobescu on 3/20/2017.
 */
public class CatPet implements Cat
{

	private String Name;

	public CatPet(String name) {
		Name = name;
	}

	public CatPet() {
		Name = "Bobby";
	}

	public void eat() {
		System.out.println("The Cat " + this.getName() + " is eating");
	}

	public void MakeNoise() {
		System.out.println("meow,meow,meow,meow,meow,meow!");

	}

	public void jump() {
		System.out.println("The cat is jumping");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public void displayInfo() {
		eat();
		MakeNoise();

	}
}
