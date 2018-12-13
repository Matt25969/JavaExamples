import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> personList = new ArrayList<>();

	public void printInfoFromList() {

		personList.stream().forEach(System.out::println);

	}

	public void addToList(Person person) {

		personList.add(person);

	}

	public void personSearch(String name) {

		personList.stream().filter(p -> name.equals(p.getName())).forEach(System.out::println);

	}

}
