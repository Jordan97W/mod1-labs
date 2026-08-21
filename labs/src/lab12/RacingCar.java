package lab12;

public class RacingCar extends Car {

	private String driver;
	private int turboFactor;

	// Constructor
	public RacingCar(String model, int speed, String driver, int turboFactor) {
		super(model, speed);
		this.driver = driver;
		this.turboFactor = turboFactor;
	}

	// Get driver
	public String getDriver() {
		return driver;
	}

	// Set driver
	public void setDriver(String driver) {
		this.driver = driver;
	}

	// Get turbo factor
	public int getTurboFactor() {
		return turboFactor;
	}

	// Set turbo factor
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}

	// Override accelerate
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds);
		setSpeed(getSpeed() * turboFactor);
	}
}