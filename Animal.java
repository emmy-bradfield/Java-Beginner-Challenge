package com.qa.animal;

public class Animal implements wordLength, containsE{
	
	// Set three variables
	public String habitat;
	public String type;
	public Integer quantity;
	public String name;
	
	// Create two methods
	public void intro() {
		System.out.println("This is a " + habitat + " " + type);
	}

	public void endangered() {
		if (quantity < 1) {
			System.out.println("You don't have this pet");
		} else if (quantity < 2) {
			System.out.println("You have this pet");
		} else {
			System.out.println("You have several of this pet!");
		}
	}
	
	// Getters and Setters
	public String getHabitat() {
		return habitat;
	}
	
	public String getType() {
		return type;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void setName(String name) {
		this.name = name;		
	}

	@Override
	public void letterE(String name) {
		if (name.indexOf("e") != -1) {
			System.out.println(name + " contains the letter 'E'");
		} else {
			System.out.println(name + " does not contain the letter 'E'");
		}
		
	}

	@Override
	public void length(String name) {
		System.out.println("There are " + name.length() + " letters in " + name);
		
	}
}
