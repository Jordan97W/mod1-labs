package lab15;

public class Duck extends Bird {
	public Duck(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println(getName() + " builds its nest near the water.");
	}
}