package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		double p, r, t, i;
		InputStreamReader in=new InputStreamReader(System.in); //Input Stream Activation
		BufferedReader ob=new BufferedReader(in);  
		System.out.println("Enter the pricipal amount:");
	     p=Double.parseDouble(ob.readLine());
	     System.out.println("Enter the rate of interest:");
	     r=Double.parseDouble(ob.readLine());
	     System.out.println("Enter the time:");
	     t=Double.parseDouble(ob.readLine());
	     i=(p*r*t)/100;
	     System.out.println("Simple interest is " + i);
	}

}