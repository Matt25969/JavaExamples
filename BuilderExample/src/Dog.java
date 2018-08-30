
public class Dog {

	private String name;
	private int age;
	private String owner;
	private int numberOfLegs;
	private String ID;

	public Dog(String name, int age, String owner, int numberOfLegs, String ID) {

		this.name = name;
		this.age = age;
		this.owner = owner;
		this.numberOfLegs = numberOfLegs;
		this.ID = ID;

	}

	public Dog(String name, int age, String Owner) {
	}

	public Dog(String name, String ID) {
	}

	public String toString() {
		return name + " " + age + " " + owner + " " + numberOfLegs + " " + ID;
	}

}
