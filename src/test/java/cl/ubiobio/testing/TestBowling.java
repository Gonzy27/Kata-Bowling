package cl.ubiobio.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBowling {
	Bowling game;
	int result;
	
	@Before
	public void setUp(){
		game = new Bowling();
	}
	
	@Test
	public void firstRollThreeAndSecondRollFiveShouldBeEight() {
		game.roll('3');
		game.roll('5');
		result = game.score();
		for (int i = 0; i < 18; i++)
			game.roll('0');
		assertEquals(8, result);
	
	}

	@Test
	public void firstRollThreeSecondRollSevenThirdRollSevenAndFourRollTwoShouldBeSevenTeen() {
		game.roll('3');
		game.roll('5');
		game.roll('7');
		game.roll('2');
		for (int i = 0; i < 16; i++)
			game.roll('0');
		result = game.score();
		assertEquals(17, result);

	}

	@Test
	public void firstRollStrikeSecondRollThreeAndTrirdRollFiveShouldBeTwentySix() {
		game.roll('X');
		game.roll('3');
		game.roll('5');
		for (int i = 0; i < 16; i++)
			game.roll('0');
		result = game.score();
		assertEquals(26, result);
	}
	
	@Test 
	public void firstRollFiveSecondRollFiveSoSpareThirdRollFiveAndFourRollTwoShouldBeTwentyTwo(){
		game.roll('5');
		game.roll('/');
		game.roll('5');
		game.roll('2');
		for (int i = 0; i < 16; i++)
			game.roll('0');
		result = game.score();
		assertEquals(22, result);
	}
		
	@Test
	public void spareAndFourAndFiveAndFiveAndThreeAndSixAndTwoAndStrike(){
		game.roll('5');
		game.roll('/');
		game.roll('X');
		game.roll('4');
		game.roll('5');
		game.roll('5');
		game.roll('3');
		game.roll('6');
		game.roll('2');
		game.roll('X');
		for (int i = 0; i < 10; i++)
			game.roll('0');
		result = game.score();
		assertEquals(74, result);
	}
}
