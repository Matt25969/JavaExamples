
public class Logic {

	public void passByReferenceTest() {

		// shows off the concept of pass by reference and pass by value

		int a = 10;
		int b = 10;

		int[] testArray = { a, b };

		a += 1;
		b += 1;

		System.out.println("a : " + a + "\n" + "b : " + b);
		System.out.println();
		System.out.println("testArray[0] : " + testArray[0] + "\n" + "testArray[1] : " + testArray[1]);

	}

}
