package com.mfg.beginner;

import java.util.*;
import java.lang.*;

// code for making a simple calculator
public class Normal{
	
	public static void sum(double num1,double num2) {
		double summation = num1+num2;
		System.out.println("Your answer is " + summation);
	}
	public static void mult(double num1, double num2) {
		double multi = num1*num2;
		System.out.println("Your answer is "+ multi);
	}
	public static void minus(double num1, double num2) {
		double min = num1-num2;
		System.out.println("Your answer is "+ min);
	}
	public static void div(double num1, double num2) {
		double division = num1/num2;
		System.out.println("Your answer is "+ division);
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your first number :   ");
		double a = reader.nextDouble();
		System.out.println("Enter your second number :   ");
		double b = reader.nextDouble();
		System.out.println("Enter your mathematical operator :  ");
		char c = reader.next().charAt(0);
		switch(c) {
		case '+': 
			sum(a,b);
			break;
		case '-' :
			minus(a,b);
			break;
		case '*' :
			mult(a,b);
			break;
		case '/' :
			div(a,b);
			break;
		default:
			System.out.println(" Invalid input");
		}
	}
}