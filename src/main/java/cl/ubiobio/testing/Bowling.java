package cl.ubiobio.testing;

public class Bowling {
	int pins = 0;


	public void roll(int pinsRoll) {
		pins += pinsRoll;


	}

	public int score() {
		return pins;
	}
}
