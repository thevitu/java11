package com.thevitu.creature.pet;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class DogExhibition {

	private List<Dog> dogs = new ArrayList<Dog>();
	private List<String> judges = new ArrayList<String>();

	/**
	 * register a dog judge name
	 * 
	 * @param name
	 */
	public void registerJudge(String name) {
		judges.add(name);
	}

	/**
	 * register a dog for exhibition
	 * 
	 * @param dog
	 */
	public void registerDog(Dog dog) {
		dogs.add(dog);
	}

	/**
	 * register multiple dogs for exhibition
	 * 
	 * @param dogs
	 */
	public void registerDogs(List<Dog> dogs) {
		dogs.stream().forEach(d -> registerDog(d));
	}

	/**
	 * view all registered dog names
	 * 
	 * @return list of Strings
	 */
	public List<String> viewAllDogs() {
		return this.dogs.stream().map(d -> format("%s - %s", d.getName(), d.getBreed()))
				.peek(System.out::println)
				.collect(toList());
	}

	/**
	 * list of registered dogs by breed
	 * 
	 * @param breed
	 * 
	 * @return dogs list
	 */
	public List<Dog> getRegisteredDogsByBreed(String breed) {
		return this.dogs.stream().filter(d -> breed.equals(d.getBreed())).collect(toList());
	}
	
	/**
	 * view small dog
	 * 
	 * @return dog
	 */
	public Dog viewSmallDog() {
		return this.dogs.stream().min(Comparator.comparing(Dog::getSize)).get();
	}

	/**
	 * Score each dog
	 * 
	 * @return list of scores
	 */
	public List<String> scoreDogs() {		
		return viewAllDogs().stream()
		 	.map(d -> judges.stream().map(j -> format("%s / Judge %s score ", d, j)).collect(toList()))
		 	.flatMap(List::stream)
		 	.map(d -> d.concat(String.valueOf((new Random()).nextInt(10))))
		 	.peek(System.out::println)
			.collect(toList());
	}

}
