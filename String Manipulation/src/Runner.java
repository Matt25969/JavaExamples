
public class Runner {

	public static void main(String[] args) {

		String target = "This String is the target";

		// chat at
		System.out.println(target.substring(0, 8));

		System.out.println(target.charAt(2));

		// trim
		System.out.println(target.trim());

		// substring

		// substring again
		System.out.println(target.trim().substring(target.length() - 5));

		// ends with
		System.out.println(target.endsWith(" "));

		// trim and endswith

		System.out.println(target.trim().endsWith("t"));

		// split

		for (String s : target.split(" ")) {
			System.out.println(s + target);

		}

		method("ghg");

	}

	public static void method(String input) {

		if (input.length() == 1) {

			System.out.println(input);

		} else {
			method(input.substring(0, input.length() - 1));
		}

	}

}
