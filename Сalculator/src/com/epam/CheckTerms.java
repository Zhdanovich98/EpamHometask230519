package com.epam;

import java.util.Scanner;

public class CheckTerms {

	double a;
	String operation;
	double b;
	double c;
	
	void sravn() {
	
	try {
		switch (operation) {
		case "+": 
			c=a+b;
			break;
		case "-": 
			c= a-b;
			break;
		case "/": 
			c= a/b;
			break;
		case "*": 
			c= a*b;
			break;
			default:
				System.out.println("Операция не выполнена");
		}
	} 
	 
catch(ArithmeticException ex) {
		ex.printStackTrace();
		
	}
	}
}
