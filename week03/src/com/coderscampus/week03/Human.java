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
} 
