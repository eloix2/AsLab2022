package junit.com;

public class ProgressiveRateStrategy implements RateStrategy {

	@Override
	public int calculaTime(int insertedSoFar) {
		int time = 0;
		if (insertedSoFar >= 350) {
			insertedSoFar -= 350;
			time = 120 + insertedSoFar/5;
		}
		else if(insertedSoFar >= 150) {
			insertedSoFar -= 150;
			time = 60 + insertedSoFar/10 * 3;
		}
		else {
			time = insertedSoFar *2/5;
		}
			
		return time;
	}

}
