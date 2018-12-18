package whyWeShouldEncapsulate;

import java.util.Scanner;

public class Person {

	private int age;
	private String name;
	// here the variable is public - not private
	public boolean hasDoneRegistration;

	public Person(int age, String name, boolean completedRegistration) {
		this.age = age;
		this.name = name;
		this.hasDoneRegistration = completedRegistration;

	}

	public void register() {
		Scanner sc = new Scanner(System.in);
		this.hasDoneRegistration = sc.nextBoolean();
	}

	public boolean isHasDoneRegistration() {
		return hasDoneRegistration;
	}

	public void setHasDoneRegistration(boolean hasDoneRegistration) {
		this.hasDoneRegistration = hasDoneRegistration;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
