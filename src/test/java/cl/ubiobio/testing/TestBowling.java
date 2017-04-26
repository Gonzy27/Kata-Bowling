package cl.ubiobio.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void firstRollThreeAndSecondRollFiveShouldBeEight() {
		Bowling game = new Bowling();
		game.roll(3);
		int result = game.roll(5);
		assertEquals(8, result);
	}

}
