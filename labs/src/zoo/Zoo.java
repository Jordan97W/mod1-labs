package zoo;

import java.util.HashMap;

public class Zoo {

	HashMap<String, Integer> animalMap = null;

	String[] originalAnimals = { "Zebra", "Lion", "Buffalo" };
	String[] newAnimals = { "Zebra", "Gazelle", "Buffalo", "Zebra" };

	public Zoo() {

		animalMap = new HashMap<String, Integer>();

		addAnimals(originalAnimals);
		addAnimals(newAnimals);

		displayAnimalData();
	}

	void addAnimals(String[] animals) {

		for (String animal : animals) {

			if (animalMap.containsKey(animal)) {
				animalMap.put(animal, animalMap.get(animal) + 1);
			} else {
				animalMap.put(animal, 1);
			}
		}
	}

	void displayAnimalData() {

		for (String animal : animalMap.keySet()) {
			System.out.println(animal + "\t\t" + animalMap.get(animal));
		}
	}
}