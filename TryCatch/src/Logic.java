import java.util.Scanner;

public class Logic {

	public static int divide(int firstNumber, int secondNumber) {

		return firstNumber / secondNumber;

	}

	public static int handledDivide(int firstNumber, int secondNumber) {

		try {
			return firstNumber / secondNumber;
		} catch (ArithmeticException ae) {

			try {
				System.out.println("You cannpot divide by 0 so the order has been reversed and tried again");
				return secondNumber / firstNumber;
			} catch (ArithmeticException ae2) {
				System.out.println("You still cannot divide these numbers together");

			}

		} finally {

			System.out.println("If the number below is -1 then the method has been able to succesfully execute");

		}

		return -1;
	}

	public static void handlingUserInput() {

		Scanner sc = new Scanner(System.in);

		int tempInt = 0;

		System.out.println("Please input a number");

		try {

			tempInt = Integer.parseInt(sc.nextLine());

			System.out.println("you typed out the number " + tempInt);

		} catch (Exception e) {

			System.out.println("That is not a number");
			handlingUserInput();

		}

	}

}
