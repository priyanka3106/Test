package com.data.input;

public class OperatorTest {

	public static void main(String[] args) {
		int a=56, b=35, c=77,x=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);//modulas Operator
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		System.out.println(a!=b);//not operator
		System.out.println(a==b);//equality operator
		a+=5;
		System.out.println(a);
		a-=5;
		System.out.println(a);
		a*=2;
		System.out.println(a);
		a/=4;
		System.out.println(a);
		System.out.println(a & b);//bitwise and Operator
		System.out.println(a | b);//bitwise or Operator
		System.out.println(a >> 2);//right shift operator
		System.out.println(a << 2);//left shift operator
	//	System.out.println(x++);
	//	System.out.println(++x);
	//	System.out.println(--x);
	//	System.out.println(x--);
		System.out.println(x++ + ++x - x--);
		int y=(20>30)?20:30;
		System.out.println(y);
		String s=(20>30)?"java":"C++";//ternary operator or conditional Operator
		System.out.println(s);
				
		
		
		
		
	}
	

}
