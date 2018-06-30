import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Person> personArray = new ArrayList<Person>();

		Person p1 = new Person("Jeff", "Builder", 33);
		Person p2 = new Person("Bob", "Cooker", 33);
		Person p3 = new Person("Ted", "Farmer", 33);
		Person p4 = new Person("Sara", "Cleaner", 33);
		Person p5 = new Person("Kate", "Maker", 33);

		PersonManager pm1 = new PersonManager();

		personArray.add(p1);
		personArray.add(p2);
		personArray.add(p3);
		personArray.add(p4);
		personArray.add(p5);

		// pm1.writeToFile(personArray);

		pm1.writeToFile(personArray);

		System.out.println(pm1.readFromFile());

	}

}
