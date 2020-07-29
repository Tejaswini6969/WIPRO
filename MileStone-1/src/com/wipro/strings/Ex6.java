package com.wipro.strings;

import java.util.Scanner;

public class Ex6 {
	public static void main(String args[])
	{
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string-a:");
		a=sc.next();
		System.out.println("Enter the string-b:");
		b=sc.next();
		int m=a.length();
		int n=b.length();
		String c="";
		c=b+a+b;
		String d="";
		d=a+b+a;
		if(m>n)
			System.out.println("The Final string is:"+c);
		else
			System.out.println("The Final string is:"+d);
		sc.close();
	}
}
