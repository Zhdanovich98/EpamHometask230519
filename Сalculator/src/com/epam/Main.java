package com.epam;

import java.util.Scanner;

public class Main {
	

public static void main(String[] args) {
	CheckTerms CheckTerms = new CheckTerms();
	Scanner Scanner = new Scanner(System.in);
	System.out.println("a:");
	CheckTerms.a = Scanner.nextInt();
	System.out.println("operation(+,-,/,*):");
	CheckTerms.operation = Scanner.next();
	System.out.println("b:");
	CheckTerms.b = Scanner.nextInt();
	CheckTerms.sravn();
System.out.println(" = " + CheckTerms.c);
}
}
