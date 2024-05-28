package com.coderscampus.week03;

import java.util.Scanner;

public class Exercise {
	String input;
	Integer converted_input;
	Scanner scanner = new Scanner(System.in);
	
	void getInput () {
		System.out.println("Type a number between 50 and 300: ");
		this.input = this.scanner.next();
		
		this.converted_input = Integer.parseInt(input);
		
		if (this.converted_input >= 50 & this.converted_input <= 300) {
			System.out.println("The number you typed in was: " + this.input);
		} else {
			System.out.println("The number you typed in was: " + null);
		}
		
		scanner.close();
	}
	
	void getInputWithWhileLoop () {
		System.out.println("Type a number between 50 and 300: ");
		this.input = this.scanner.next();
		this.converted_input = Integer.parseInt(this.input);

		while(this.converted_input > 0) {
			if (this.converted_input >= 50 & this.converted_input <= 300) {
				System.out.println("The number you typed in was: " + this.input);
				break;
			} else {
				System.out.println("Oops, that number wasn't between 50 and 300, try again: ");
				this.input = this.scanner.next();
				this.converted_input = Integer.parseInt(this.input);
			}
		}
		
		scanner.close();
	}
}
