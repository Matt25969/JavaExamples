package whyWeShouldEncapsulate;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person bert = new Person(20, "Bert", true);

		Person jeff = new Person(30, "Jeff", false);

		System.out.println(bert.hasDoneRegistration);

		System.out.println(jeff.hasDoneRegistration);

		PersonManager pm1 = new PersonManager();

		pm1.checkIfPersonHasRegistered(bert);

		pm1.checkIfPersonHasRegistered(jeff);

	}

}
