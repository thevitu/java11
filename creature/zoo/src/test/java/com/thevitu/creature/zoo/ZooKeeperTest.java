package com.thevitu.creature.zoo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.thevitu.creature.animal.Animal;

public class ZooKeeperTest {
	
	@Test
	public void testGetMessage() {
		assertEquals("Don't feed the animals", ((ZooKeeper) (a, f) -> {}).getMessage());		
		assertEquals("Don't feed the animals", (new ZooKeeper() {			
			@Override
			public void feedAnimal(Animal animal, Food food) {
			}
		}).getMessage());
	}

	@Test
	public void testGetMessage2() {
		assertEquals("Don't feed the trolls", ZooKeeper.getMessage2());
	}
	
}
