import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BlackJackTest {

	@Test
	public void testNumberOne() {

		BlackJack.play(21, 10);

	}

	@Test
	public void testNumberTwo() {

		int output = BlackJack.play(21, 10);

		assertEquals(21, output);

	}

	@Test
	public void testNumberThree() {

		int output = BlackJack.play(10, 21);

		assertEquals(21, output);

	}

}
