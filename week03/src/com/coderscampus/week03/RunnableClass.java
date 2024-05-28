package com.coderscampus.week03;

import java.util.Random;

public class RunnableClass {
 
	public static void main(String[] args) {		
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's a instantiation of a Class
		
		Random random = new Random();
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Random number is " + random.nextInt(10));			
		}
		
//		Human jeanGrah = new Human();
//		jeanGrah.setProperties("Jean Grah", "Male", "6'0\"", "195", "Brown", "Full Stack Developer");
//		System.out.println(jeanGrah.getInfo());
		
//		Human elonMusk = new Human();
//		elonMusk.setProperties("Elon Musk", "Male", "5'10\"", "195", "Blue", "Businessman and investor");
//		System.out.println(elonMusk.getInfo());
		
//		Human helenMirren = new Human();
//		helenMirren.setProperties("Helen Mirren", "Female", "4'7\"", "156", "Gray", "Actress");
//		System.out.println(helenMirren.getInfo());

		/*
		 * UNIT 3 - [Exercise]: Creating a Method
		 */	
	                             	
		
//		ReadUserInput userInput = new ReadUserInput();
//		userInput.getInput();
	}

}
