package com.coderscampus.week03;

public class RunnableClass {

	public static void main(String[] args) {		
		// Class -> Blueprint for an Object
		// Object -> a Noun, it's a instantiation of a Class
		
		Human jeanGrah = new Human();
		
		jeanGrah.name = "Jean Grah";
		jeanGrah.occupation = "Full Stack Developer";
		jeanGrah.gender = "Male";
		jeanGrah.height = "6'0\"";
		jeanGrah.weight = "195";
		jeanGrah.eyeColor = "Brown";
		
		System.out.println(jeanGrah.getInfo());
		
		Human elonMusk = new Human();

		elonMusk.name = "Elon Musk";
		elonMusk.occupation = "Businessman and investor";
		elonMusk.gender = "Male";
		elonMusk.height = "5'10\"";
		elonMusk.weight = "195";
		elonMusk.eyeColor = "Blue";
		
		System.out.println(elonMusk.getInfo());
		
		Human helenMirren = new Human();

		helenMirren.name = "Helen Mirren";
		helenMirren.occupation = "Actress";
		helenMirren.gender = "Female";
		helenMirren.height = "4'7\"";
		helenMirren.weight = "156";
		helenMirren.eyeColor = "Gray";
		
		System.out.println(helenMirren.getInfo());
	}

}
