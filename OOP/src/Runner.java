
public class Runner {

	public static void main(String[] args) {

		Person amy = new Person();

		Person jeff = new Person("Blue");

		System.out.println(amy.getEyes());

		System.out.println(jeff.getEyes());

		jeff.setEyes("Red");

		System.out.println(jeff.getEyes());

	}

}
