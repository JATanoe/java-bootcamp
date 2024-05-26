package com.coderscampus.week03;

import java.util.Scanner;

public class ReadUserInput {
	String input;
	Integer converted_input;
	Scanner scanner = new Scanner(System.in);
	
	void getInput () {
		System.out.println("Type a number between 50 and 300: ");
		this.input = this.scanner.next();
		
		this.converted_input = Integer.parseInt(input);
		
		if (converted_input >= 50 & converted_input <= 300) {
			System.out.println("The number you typed in was: " + this.input);
		} else {
			System.out.println("The number you typed in was: " + null);
		}
		
		scanner.close();
	}
}
