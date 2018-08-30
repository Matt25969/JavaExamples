
public class DogBuilder {

	private String name;
	private int age = 0;
	private String owner = "No one";
	private int numberOfLegs = 4;
	private String ID = "A0001";

	public Dog buildDog() {
		return new Dog(name, age, owner, numberOfLegs, ID);
	}

	public DogBuilder name(String name) {

		this.name = name;
		return this;

	}

	public DogBuilder age(int age) {

		this.age = age;
		return this;

	}

	public DogBuilder owner(String owner) {

		this.owner = owner;
		return this;

	}

	public DogBuilder numberOfLegs(int numberOfLegs) {

		this.numberOfLegs = numberOfLegs;
		return this;

	}

	public DogBuilder ID(String ID) {

		this.ID = ID;
		return this;

	}

}
