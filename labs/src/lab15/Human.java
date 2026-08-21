package lab15;

public class Human extends Mammal {
	public Human(String name) {
		super(name);
	}

	@Override
	public void action() {
		System.out.println(getName() + " goes to the pub to have a drink.");
	}
}