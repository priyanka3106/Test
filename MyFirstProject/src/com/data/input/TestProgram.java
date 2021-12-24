package com.data.input;

import java.util.Scanner;

public class TestProgram {

	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		int a, b;
		long c,d;
		float e,f;
		System.out.println("Enter value for a");
		a=ob.nextInt();
		System.out .println("Enter value for b");
		b=ob.nextInt();
		System.out.println("Addition of two number is "+(a+b));
		System.out.println("Enter value for e");
		e=ob.nextFloat();
		System.out .println("Enter value for f");
		f=ob.nextFloat();
		System.out.println("Addition of two number is "+(e+f));
		String name;
		name=ob.next();
		System.out.println(name);
		ob.close();
	
		
	}
}
