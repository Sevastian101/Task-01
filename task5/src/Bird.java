/**
 * Created by sodobescu on 3/20/2017.
 */
public abstract class Bird implements Animal {
	protected String Name;

	public Bird(String name) {
		Name = name;
	}

	public Bird() {
		Name = "Babby Dragon";
	}

	public void eat() {
		System.out.println("The Bird " + this.getName() + " is eating");
	}

	public void MakeNoise() {
		System.out.println("haey,haey,haey,haey,haey!");
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
