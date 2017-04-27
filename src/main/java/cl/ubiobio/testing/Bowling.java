package cl.ubiobio.testing;

public class Bowling {
	int pins = 0;
	boolean primerRoll = true;
	boolean strike = false;
	boolean spare = false;
	int previousRoll = 0;
	int contStrike = 0;

	public void roll(char pinsRoll) {
		if (pinsRoll == 'X') {
			strike = true;
			pins += 10;
		} else if (pinsRoll == '/') {
			spare = true;
			pins += (10 - previousRoll);
		} else {
			if (pinsRoll == '/')
				System.out.println("asd");
			pins += Character.getNumericValue(pinsRoll);
			previousRoll = Character.getNumericValue(pinsRoll);
			if (strike == true) {
				pins += Character.getNumericValue(pinsRoll);
				contStrike += 1;
			}
			if (contStrike == 2) {
				contStrike = 0;
				strike = false;
			}
			if (spare == true){
				pins += Character.getNumericValue(pinsRoll);
				spare = false;
			}
		}
	}

	public int score() {
		return pins;
	}
}