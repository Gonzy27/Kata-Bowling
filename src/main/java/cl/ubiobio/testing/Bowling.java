package cl.ubiobio.testing;

public class Bowling {
	int pins = 0;
	boolean strike = false;
	int contStrike = 0;

	public void roll(int pinsRoll) {
		pins += pinsRoll;
		if (strike == true) {
			pins += pinsRoll;
			contStrike += 1;
		}
		if(contStrike == 2){
			contStrike = 0;
			strike = true;
		}
		if (pinsRoll == 10)
			strike = true;

	}

	public int score() {
		return pins;
	}
}