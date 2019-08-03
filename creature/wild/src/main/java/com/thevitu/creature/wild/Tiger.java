package com.thevitu.creature.wild;

import static com.thevitu.creature.animal.AnimalClass.MAMMAL;

import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.animal.AnimalClass;

/**
 * 
 * Tiger type
 *
 */
public class Tiger implements Animal {

	@Override
	public String getDescription() {
		return "Panthera tigris";
	}

	@Override
	public AnimalClass getAnimalClass() {
		return MAMMAL;
	}

}
