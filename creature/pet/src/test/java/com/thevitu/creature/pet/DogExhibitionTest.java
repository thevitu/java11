package com.thevitu.creature.pet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DogExhibitionTest {

	private static List<Dog> dogs;

	@BeforeAll
	public static void init() {
		dogs = new ArrayList<Dog>();
		Dog dog1 = new Dog();
		dog1.setName("Logan");
		dog1.setBreed("Scottish Terrier");
		dog1.setSize(12);
		dogs.add(dog1);
		Dog dog2 = new Dog();
		dog2.setName("Luna");
		dog2.setBreed("Scottish Terrier");
		dog2.setSize(11);
		dogs.add(dog2);
		Dog dog3 = new Dog();
		dog3.setName("Titi");
		dog3.setBreed("Labrador");
		dog3.setSize(20);
		dogs.add(dog3);
	}

	@Test
	public void testRegisterDog() {
		try {
			DogExhibition dogExhibition = new DogExhibition();
			dogExhibition.registerDog(dogs.get(0));
		} catch (Throwable e) {
			fail(e);
		}
	}

	@Test
	public void testRegisterDogs() {
		try {
			DogExhibition dogExhibition = new DogExhibition();
			dogExhibition.registerDogs(dogs);
		} catch (Throwable e) {
			fail(e);
		}
	}

	@Test
	public void testViewAllDogs() {
		DogExhibition dogExhibition = new DogExhibition();
		dogExhibition.registerDogs(dogs);
		assertEquals(Arrays.asList("Logan - Scottish Terrier", "Luna - Scottish Terrier", "Titi - Labrador"), dogExhibition.viewAllDogs());
	}

	@Test
	public void testViewSmallDog() {
		DogExhibition dogExhibition = new DogExhibition();
		dogExhibition.registerDogs(dogs);
		assertEquals("Luna", dogExhibition.viewSmallDog().getName());
	}

	@Test
	public void testScoreDogs() {
		DogExhibition dogExhibition = new DogExhibition();
		dogExhibition.registerDogs(dogs);
		dogExhibition.registerJudge("Bob");
		dogExhibition.registerJudge("Patrick");
		assertEquals(6, dogExhibition.scoreDogs().size());
	}
	
}
