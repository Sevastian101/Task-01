/**
 * Created by sodobescu on 3/20/2017.
 */
public class Aliens extends Alien {

	public Aliens(String name) {
		super(name);
	}

	public void fight(){
		System.out.println(this.getName()+" is fighting");

	}
	public  void displayInfo(){
		eat();
		fight();
		MakeNoise();


	}
}
