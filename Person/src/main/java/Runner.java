
public class Runner {

	public static void main(String[] args) {

		Person tom = new Person("Tom", "Consultant", 22);

		Person matt = new Person("Bert", "Consultant", 232);

		Person jeff = new Person("bikjh", "Consultant", 2);

		Person bert = new Person("Bob", "Consultant", 2255);

		// System.out.println("Hello");
		//
		// System.out.println(9);
		//
		// System.out.println(tom);

		PersonManager pm1 = new PersonManager();

		pm1.addToList(tom);

		pm1.addToList(jeff);

		pm1.addToList(matt);

		pm1.addToList(bert);

		// pm1.printInfoFromList();

		pm1.personSearch("Tomjhgf");

	}

}
