package lab3;

public class Program {
	public static void main(String[] args) {
		
		Getters getters = new Getters();
		Weight weight = new Weight();
				
		int code = 0;
		//0 = lunch, 1 = weight
		
		if (code == 0) {
			// theLunchQueue();
		}
		else if(code == 1)
		{
			int kgs = getters.getInt("What is your weight in kilograms: ");
			weight.convertKgsToStonePounds(kgs);
		}		
	}

	public static void theLunchQueue() {
		
		Getters getters = new Getters();
		
		String mainCourse = getters.getString("What main dish would you like(Fish, Burgers or veg)?");
		
		int potatoes = getters.getInt("How many roast potatoes would you like?");
		int sprouts = getters.getInt("How many Brussel Sprouts would you like?");
		
		System.out.printf("Hello, your lunch is %s with %d roast potatoes %d Brussel sprouts.", mainCourse, potatoes,
				sprouts);
	}
}
