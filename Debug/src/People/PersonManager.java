package People;
import java.util.ArrayList;

public class PersonManager {

	private ArrayList<Person> peopleList = new ArrayList<>();

	public ArrayList<Person> getPeopleList() {
		return peopleList;
	}

	public String searchForName(String search) {

		for (Person p : peopleList) {
			if (p.getJobTitle().equals(search)) {
				return "Found the Person";

			}

		}

		return "Did not find anyone";

	}
}
