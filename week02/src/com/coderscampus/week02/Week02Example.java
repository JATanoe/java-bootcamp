package com.coderscampus.week02;

import java.util.Scanner;

public class Week02Example {

	public static void main(String[] args) {
		/*
		 * UNIT 2 - Lesson 12: Reading User Input
		 */		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter your current age: "); 
//		String user_input = scanner.next();
//		System.out.println("I am " + user_input + " years old.");
		 
		/*
		 * UNIT 2 - [Exercise]: Reading User Input
		 */	
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Type a number between 50 and 300: ");
//		String user_input = scanner.next();
//
//		Integer converted_input = Integer.parseInt(user_input);
//
//		if (converted_input >= 50 & converted_input <= 300) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
//		
//		scanner.close();
		
		/*
		 * UNIT 2 - Lesson 13: Reading User Input
		 */	
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type in your name: ");
		String name = scanner.nextLine();		
		System.out.println("Type in your age: ");
		String age = scanner.nextLine();		
		
		if (name.equals("Jean") 
				&& age.equals("39")) {		
			System.out.println("Holy cow it's me!");
		} else {		
			System.out.println("Hello " + name + "!");
		}
		
		scanner.close();
	}

}
