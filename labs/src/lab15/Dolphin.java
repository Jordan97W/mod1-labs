package lab15;

public class Dolphin extends Mammal {
	public Dolphin(String name) {
		super(name);
	}

	@Override
	public void action() {
		System.out.println(getName() + " likes to beat up sharks.");
	}
}