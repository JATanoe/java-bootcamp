package com.coderscampus.week03;

public class Human {
	String name;
	String occupation;
	String gender;
	String height;
	String weight;
	String eyeColor;
	
	// (Visibility modifier), return type, method name, parameters
	String getInfo () {
		String info = "\nName: " + name + "\nGender: " + gender + "\nHeight: " + height + " ft \nWeight: " + weight + " lbs \nEye color: " + eyeColor + "\nOccupation: " + occupation;
		return info;
	}
	
	void setProperties (String name, String gender, String height, String weight, String eyeColor, String occupation) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		this.eyeColor = eyeColor;
		this.occupation = occupation;
		
		System.out.println("Name: " + this.name);
		System.out.println("Gender: " + this.gender);
		System.out.println("Height: " + this.height + " ft ");
		System.out.println("Weight: " + this.weight + " lbs ");
		System.out.println("Eye color: " + this.eyeColor);
		System.out.println("Occupation: " + this.occupation);
		System.out.println();
	}
} 
