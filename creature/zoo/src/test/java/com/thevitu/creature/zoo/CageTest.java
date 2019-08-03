package com.thevitu.creature.zoo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.thevitu.creature.animal.Animal;
import com.thevitu.creature.animal.AnimalClass;

public class CageTest {

	private Cage cage = new Cage();

	@Test
	public void testPut() {
		try {
			this.cage.put(new Animal() {
				public String getDescription() {
					return null;
				}			
				@Override
				public AnimalClass getAnimalClass() {
					return null;
				}
			});
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	public void testPutRandomAnimal() {
		try {
			this.cage.putRandomAnimal();
		} catch (Exception e) {
			fail(e);
		}
	}

	@Test
	public void testViewAnimal() {
		this.cage.putRandomAnimal();
		assertEquals("Empyt cage", this.cage.viewAnimal());
	}

}
