package com.thevitu.creature.wild;

import static com.thevitu.creature.animal.AnimalClass.BIRD;

import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.animal.AnimalClass;

/**
 * 
 * Eagle type
 *
 */
public class Eagle implements Animal {

	@Override
	public String getDescription() {
		return "Benfica!!!";
	}

	@Override
	public AnimalClass getAnimalClass() {
		return BIRD;
	}

}
