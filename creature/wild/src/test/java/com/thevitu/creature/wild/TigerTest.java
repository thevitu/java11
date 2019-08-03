package com.thevitu.creature.wild;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.thevitu.creature.animal.AnimalClass;

public class TigerTest {
	
	private Tiger tiger = new Tiger();

	@Test
	public void testGetDescription() {
		assertEquals("Panthera tigris", tiger.getDescription());
	}

	@Test
	public void testGetAnimalClass() {
		assertEquals(AnimalClass.MAMMAL, tiger.getAnimalClass());
	}

}
