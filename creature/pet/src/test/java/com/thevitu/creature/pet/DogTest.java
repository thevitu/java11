package com.thevitu.creature.pet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Field;

import org.junit.jupiter.api.Test;

import com.thevitu.creature.animal.AnimalClass;

public class DogTest {
	
	private Dog dog = new Dog();

	@Test
	public void testGetDescription() {
		assertEquals("Canis lupus familiaris", dog.getDescription());
	}

	@Test
	public void testGetAnimalClass() {
		assertEquals(AnimalClass.MAMMAL, dog.getAnimalClass());
	}
	
	//@Test
	public void testReflection() {
		try {
			AnimalClass fish = AnimalClass.FISH;
			Field code = fish.getClass().getDeclaredField("code");
			code.setAccessible(true);
			int codeValue = (int) code.get(fish);
			assertEquals(5, codeValue);
		} catch (Throwable e) {
			fail(e);
		}				
	}
	
}
