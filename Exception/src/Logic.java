import java.util.InputMismatchException;
import java.util.Scanner;

public class Logic {

	public int divide(int arg1, int arg2) {
		int result = -1;
		try {
			Scanner sc = new Scanner(System.in);
			int thisThing = sc.nextInt();
			result = arg1 / thisThing;
		} catch (ArithmeticException ae) {
			System.out.println("Sorry you cant divide by 0");
			result = arg1 / (arg2 + 2);
			return result;

		} catch (InputMismatchException ime) {

			System.out.println("Please typoe a number");
			return divide(arg1, arg2);

		} catch (Exception e) {
		}

		return result;

	}

}
