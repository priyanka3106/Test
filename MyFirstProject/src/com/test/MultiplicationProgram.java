package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a1, b1;
		BufferedReader ob1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of a1");
		a1=Integer.parseInt(ob1.readLine());
		System.out.println("Enter the value of b1");
		b1=Integer.parseInt(ob1.readLine());
		System.out.println(a1*b1);
		

	}

}
