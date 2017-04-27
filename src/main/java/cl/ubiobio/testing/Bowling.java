package cl.ubiobio.testing;

public class Bowling {
	int pins = 0;
	boolean strike = false;
	boolean spare = false;
	int previousRoll = 0;
	int contStrike = -1;
	int valueRoll = 0;

	public void roll(char pinsRoll) {
		if (pinsRoll == 'X') {
			strike = true;
			pins += 10;
		} else if (pinsRoll == '/') {
			spare = true;
			pins += (10 - previousRoll);
		} else {
			valueRoll = Character.getNumericValue(pinsRoll);
			pins += valueRoll;
			previousRoll = valueRoll;
			if (strike == true) {
				pins += valueRoll;
				contStrike += 1;
			}
		}
		if (contStrike == 2) {
			contStrike = 0;
			strike = false;
		}
		if (spare == true) {
			pins += valueRoll;
			spare = false;

		}
	}

	public int score() {
		return pins;
	}
}