package com.wipro.strings;

import java.util.Scanner;

public class Ex4 {
	public static void main(String args[])
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.next();
		int n=a.length();
		if(n%2==0)
			System.out.println("Substring:"+a.substring(0,n/2));
		else
			System.out.println("null");
		sc.close();
	}
}
