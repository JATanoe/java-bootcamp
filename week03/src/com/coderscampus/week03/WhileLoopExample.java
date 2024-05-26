package com.coderscampus.week03;

import java.util.Calendar;
import java.util.Date;

public class WhileLoopExample {
	
	void whileLoopExample1 () {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Done");
	}
	
	void whileLoopExample2 () {
		
		Date now = new Date();
		Date stopNow = new Date(2024, 4, 26, 10, 35, 30);
		
		int i = 0;
		while (now.before(stopNow)) {
			i++;
			System.out.println(i + ": " + now);
			now = new Date();
		}
//		System.out.println("Done");
		
		System.out.println(stopNow);
		
	}
	
}
