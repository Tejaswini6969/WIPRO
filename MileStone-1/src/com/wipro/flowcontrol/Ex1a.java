package com.wipro.flowcontrol;

public class Ex1a {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		if(a==0)
			System.out.println("Given number is Zero");
		else if(a<0)
			System.out.println("Given number is Negative Number");
		else
			System.out.println("Given number is Positive Number");
	}
}
