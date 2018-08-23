
public class Runner {

	public static void main(String[] args) {

		Person p1 = new Person("Bert", 23, "Farmer");

		Person p2 = new Person("Jeff", 29, "Builder");

		PersonManager pm1 = new PersonManager();

		pm1.getPeopleList().add(p1);

		pm1.getPeopleList().add(p2);

		for (Person p : pm1.getPeopleList()) {

			System.out.println(p);

		}

		System.out.println(pm1.searchForName("Bert"));

		pm1.getPeopleList().remove(0);

		pm1.getPeopleList().remove(p2);

		for (Person p : pm1.getPeopleList()) {

			System.out.println(p);

		}

	}

}
