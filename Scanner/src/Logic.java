import java.util.Scanner;

public class Logic {

	public static void scannerMethod() {

		Scanner sc = new Scanner(System.in);

		String check1 = sc.nextLine();

		String check2 = sc.next();

		if (check2.equals("Bob")) {
			System.out.println("OK");
		}

		sc.close();

	}

}
