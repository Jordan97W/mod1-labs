package lab3;

public class Weight {
	public void convertInputToStonesPounds(int pounds) {
		
		int stones = pounds / 14;
		int remainingPounds = pounds % 14;
		
		System.out.printf("Weight: %d stones and %d pounds", stones, remainingPounds);
	}
	public void convertKgsToStonePounds(int kg) {
		
		double conversion = 2.20462;
		int pounds = (int) (kg * conversion);
		
		convertInputToStonesPounds(pounds);
	}
}