package com.qa.personChallenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person personOne = new Person("Emily", 23, "Trainee Software Specialist");
		Person personTwo = new Person("James", 20, "Full-time Student");
		Person personThree = new Person("Chloe", 24, "Cabin Crew Member");
		
		System.out.println(personOne.makeString());
		System.out.println(personTwo.makeString());
		System.out.println(personThree.makeString());
		
		
		List<Person> people = new ArrayList<>();
		people.add(personOne);
		people.add(personTwo);
		people.add(personThree);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\t\tSEARCH ITEMS");
		System.out.print("\tEnter item name: ");
		String nameSearch = scan.nextLine();
		System.out.println("");
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i).getName().equalsIgnoreCase(nameSearch)) {
				System.out.println("\t[" + nameSearch.toUpperCase() + " FOUND IN DATABASE]");
				scan.close();
				System.out.println("Name: " + people.get(i).getName() + " | Age: " + people.get(i).getAge() + " | Job: " + people.get(i).getJob() + "\n\n");
				break;
			} else {
				System.out.println("\t[" + nameSearch.toUpperCase() + " NOT IN DATABASE]\n\n");
				scan.close();
				break;
			}
		}
		
		for (int i = 0; i < people.size();i++) {
			System.out.println("ENTRY " + (i+1) + " ---->\t" + people.get(i).getName() + ", " + people.get(i).getAge() + ", " + people.get(i).getJob());
		}
	}
	
}
