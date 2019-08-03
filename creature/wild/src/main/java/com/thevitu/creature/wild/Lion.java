package com.thevitu.creature.wild;

import static com.thevitu.creature.animal.AnimalClass.MAMMAL;

import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.animal.AnimalClass;

/**
 * 
 * Tiger type
 *
 */
public class Lion implements Animal {
	
	@Override
	public String getDescription() {
		return "Sporting CP";
	}

	@Override
	public AnimalClass getAnimalClass() {
		return MAMMAL;
	}
	
}
