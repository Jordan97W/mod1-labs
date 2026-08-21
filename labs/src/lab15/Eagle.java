package lab15;

public class Eagle extends Bird {
	public Eagle(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println(getName() + " builds a nest out of sticks in trees.");
	}
}