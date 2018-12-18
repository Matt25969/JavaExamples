package whyWeShouldEncapsulate;

import java.util.ArrayList;
import java.util.List;

public class PersonManager {

	List<Person> personList = new ArrayList<>();

	public void addToList(Person p) {
		personList.add(p);
	}

	public void checkIfPersonHasRegistered(Person p) {

		while (p.hasDoneRegistration = false) {
			p.register();

		}

	}

}
