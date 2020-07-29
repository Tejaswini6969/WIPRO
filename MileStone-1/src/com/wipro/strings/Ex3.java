package com.wipro.strings;

import java.util.Scanner;

public class Ex3 {
	public static void main(String args[])
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.next();
		int n=a.length();
		String a1="";
		for(int i=0;i<n;i++)
		{
			a1=a1+a.substring(0,2);
		}
		System.out.println("The final String is:"+a1);
		sc.close();
	}
}
