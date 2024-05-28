package com.coderscampus.week03;

import java.util.Random;

public class RunnableClass {
 
	public static void main(String[] args) {		
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's a instantiation of a Class
		
//		Random random = new Random();
//		
//		for (int i = 0; i < 20; i++) {
//			System.out.println("Random number is " + random.nextInt(10));
//		}
		
		// Call no args constructor
		Human anotherHuman = new Human();
		
		// Call agrs constructor
		Human jeanGrah = new Human("Jean Grah", "Full Stack Developer", "Male", "6'0\"", "195", "Brown");
		System.out.println(jeanGrah.getInfo());
		
		Human elonMusk = new Human("Elon Musk", "Businessman and investor", "Male", "5'10\"", "195", "Blue");
		System.out.println(elonMusk.getInfo());
		
		Human helenMirren = new Human("Helen Mirren", "Actress", "Female", "4'7\"", "156", "Gray");
		System.out.println(helenMirren.getInfo());
		
		/*
		 * UNIT 3 - [Exercise]: Creating a Method
		 */	
		
//		ReadUserInput userInput = new ReadUserInput();
//		userInput.getInput();
	}

}
