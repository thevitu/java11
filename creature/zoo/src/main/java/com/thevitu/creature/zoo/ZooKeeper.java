package com.thevitu.creature.zoo;

import static java.lang.String.format;

import com.thevitu.creature.animal.Animal;

@FunctionalInterface
public interface ZooKeeper {
	
	private static String formatMessage(String value) {
		return format("Don't feed the %s", value);
	}

	default String getMessage() {
		return formatMessage("animals");
	}
	
	static String getMessage2() {
		return formatMessage("trolls");
	}
	
	void feedAnimal(Animal animal, Food food);
}
