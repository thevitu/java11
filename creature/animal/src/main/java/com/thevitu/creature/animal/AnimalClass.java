package com.thevitu.creature.animal;

/**
 * 
 * Animal Classes
 *
 */
public enum AnimalClass {
	MAMMAL(1),
	BIRD(2),
	REPITILE(3),
	INVERTEBRATES(4),
	FISH(5),
	AMPHIBIAN(6);
	
	private AnimalClass(int code) {
		this.code = code;
	}

	private final int code;
	
	/**
	 * numeric code value of Animal Class
	 * 
	 * @return
	 */
	public int getCode() {
		return code;
	}
	
}
