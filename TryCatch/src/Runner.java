
public class Runner {

	public static void main(String[] args) {

		try {
			Logic.divide(10, 0);
		} catch (ArithmeticException ae) {
			System.out.println("You cannot divide by 0");
		}

		System.out.println(Logic.handledDivide(9, 0));

		Logic.handlingUserInput();

	}

}
