package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class temperatureconversion {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		InputStreamReader in=new InputStreamReader(System.in); //Input Stream Activation
		BufferedReader ob=new BufferedReader(in);              //Buffer Activation
		Double c, f;
		System.out.println("Enter value for fahrenheit:");
		f=Double.parseDouble(ob.readLine());
		c=(f-32)/9*5;
		System.out.println("Temperature in celcius is:" +c);


	}

}
