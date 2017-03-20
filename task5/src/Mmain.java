/**
 * Created by sodobescu on 3/20/2017.
 */
public class Mmain {
	public static void main(String args[]) {

		HunterDog H = new HunterDog("Raxy", "Hogyy", 22, true, true);
		CatPet C = new CatPet();
		BirdPet B = new BirdPet(22, "Seva101");
		Aliens A = new Aliens("Predator");
		H.displayInfo();
		C.displayInfo();
		B.displayInfo();
		A.displayInfo();

		System.out.println("----------------------------------------");

		Animal[] HH = new Animal[4];
		HH[0] = new HunterDog();
		HH[1] = new CatPet();
		HH[2] = new Aliens("Witch");
		HH[3] = new BirdPet(3, "Papagal");

		for (int i = 0; i < HH.length; i++) {
			System.out.println("Animal:" + i);
			HH[i].eat();
			HH[i].MakeNoise();

		}
	}
}
