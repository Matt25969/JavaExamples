
public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog("Fido", 7, "Fred", 4, "SC001");

		Dog d1 = new DogBuilder().name("Bert").buildDog();

		Dog d2 = new DogBuilder().owner("Jeff").name("Clive").age(5).buildDog();

		System.out.println(d.toString());

		System.out.println(d1.toString());

		System.out.println(d2.toString());

	}

}
