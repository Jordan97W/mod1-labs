package lab15;

public abstract class Animal {
	AnimalType animalType;
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}
}