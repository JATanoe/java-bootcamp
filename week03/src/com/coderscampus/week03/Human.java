package com.coderscampus.week03;

public class Human {
	
	String name;
	String occupation;
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	Human () {}
	
	Human (String name, String gender, String height, String weight, String eyeColor, String occupation) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.occupation = occupation;
	}
	
	// (Visibility modifier), return type, method name, parameters
	String getInfo () {
		return "Name: " + name + "\nGender: " + gender 
				+ "\nHeight: " + height + " ft \nWeight: " + weight 
				+ " lbs \nEye color: " + eyeColor + "\nOccupation: " + occupation + "\n";
	}
	
} 
