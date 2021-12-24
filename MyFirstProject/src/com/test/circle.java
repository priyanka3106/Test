package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class circle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader in=new InputStreamReader(System.in); //Input Stream Activation
		BufferedReader ob=new BufferedReader(in);              //Buffer Activation
		Double p,a,r;
		System.out.println("Enter value for radius:");
		r=Double.parseDouble(ob.readLine());
		a=3.14*r*r;
		System.out.println("Area of circle is " +a);
		p=2*3.14*r;
		System.out.println("Perimeter of circle is " +p);

	}

}
