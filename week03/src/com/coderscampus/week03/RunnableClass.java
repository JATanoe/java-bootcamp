package com.coderscampus.week03;

public class RunnableClass {

	public static void main(String[] args) {		
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's a instantiation of a Class
		
		Human jeanGrah = new Human();
		
		jeanGrah.gender = "Male";
		jeanGrah.height = "6'0\"";
		jeanGrah.weight = "195";
		jeanGrah.eyeColor = "Brown";
		
		System.out.println(jeanGrah);
		
		Human elonMusk = new Human();
		
		jeanGrah.gender = "Male";
		jeanGrah.height = "5'10\"";
		jeanGrah.weight = "195";
		jeanGrah.eyeColor = "Blue";
		
		System.out.println(elonMusk);
	}

}
