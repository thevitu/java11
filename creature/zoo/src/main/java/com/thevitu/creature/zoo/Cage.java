package com.thevitu.creature.zoo;

import static java.lang.String.format;

import java.util.ServiceLoader;

import com.thevitu.creature.animal.Animal;

/**
 * 
 * Animal cage
 *
 */
public class Cage {

	private Animal animal;
	
	public void put(Animal animal) {
		this.animal = animal;
	}
	
	public void putRandomAnimal() {
		ServiceLoader<Animal> serviceLoader = ServiceLoader.load(Animal.class);
		this.animal = serviceLoader.findFirst().orElse(null);
	}
	
	public String viewAnimal() {
		return this.animal == null ? "Empyt cage" : format("%s: %s", this.animal.getClass().getName(), this.animal.getDescription());
	}
	
}
