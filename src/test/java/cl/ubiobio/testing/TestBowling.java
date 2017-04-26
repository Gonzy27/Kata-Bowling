package cl.ubiobio.testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void firstRollThreeAndSecondRollFiveShouldBeEight() {
		Bowling game = new Bowling();
		game.roll(3);
		game.roll(5);
		int result = game.score();
		for (int i = 0; i < 18; i++)
			game.roll(0);
		assertEquals(8, result);
	
	}

	@Test
	public void firstRollThreeSecondRollSevenThirdRollSevenAndFourRollTwoShouldBeSevenTeen() {
		Bowling game = new Bowling();
		game.roll(3);
		game.roll(5);
		game.roll(7);
		game.roll(2);
		for (int i = 0; i < 16; i++)
			game.roll(0);
		int result = game.score();
		assertEquals(17, result);

	}

		
}
