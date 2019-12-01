package _01_AnimalFarm;

public class Farm {
	public static void main(String[] args) {
		Cow cow = new Cow();
		Cow cow1 = new Cow();
		Pig pig = new Pig();
		Pig pig1 = new Pig();
		Chicken chicken = new Chicken();
		Horse horse = new Horse();
		Animal[] farm = {cow, cow1, pig, pig1, chicken, horse};
		for (int i = 0; i < farm.length; i++) {
			farm[i].makeNoise();
			farm[i].eat();
		}
	}
}
