package com.thevitu.creature.pet;

import static com.thevitu.creature.animal.AnimalClass.MAMMAL;

import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.animal.AnimalClass;

/**
 * Dog type
 * 
 */
public class Dog implements Animal {	
	
	private String breed;
	
	private int size;
	
	private String name;
	
	@Override
	public String getDescription() {
		return "Canis lupus familiaris";
	}

	@Override
	public AnimalClass getAnimalClass() {
		return MAMMAL;
	}
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
