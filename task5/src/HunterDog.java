/**
 * Created by sodobescu on 3/20/2017.
 */
public class HunterDog implements Dog {
	private String Name;
	private String Priority;

	private int Age;
	private boolean iscarnivore;
	private boolean istrained;

	public HunterDog() {
		Name = "Rax";
		Priority = "Hog";
		Age = 22;
		iscarnivore = true;
		istrained = true;
	}

	public HunterDog(String name, String priority, int age, boolean car, boolean trained) {
		Name = name;
		Priority = priority;
		Age = age;
		iscarnivore = car;
		istrained = trained;
	}

	public void eat() {
		System.out.println("The Hunter Dog " + this.getName() + " is eating");
	}

	public void MakeNoise() {
		System.out.println("Bark,Bark,Bark,Bark,Bark,Bark!");
	}

	public boolean iscarnivore() {
		return iscarnivore;
	}

	public boolean istrained() {
		return istrained;
	}

	public void setIscarnivore(boolean iscarnivore) {
		this.iscarnivore = iscarnivore;
	}

	public void setIstrained(boolean istrained) {
		this.istrained = istrained;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getPriority() {
		return Priority;
	}

	public void setPriority(String priority) {
		Priority = priority;
	}

	public void displayInfo() {
		eat();
		MakeNoise();

	}
}
