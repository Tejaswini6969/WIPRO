package com.wipro.strings;
import java.util.Scanner;
public class Ex5 {
	public static void main(String args[])
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		a=sc.next();
		int n=a.length();
		System.out.println("Substring:"+a.substring(1,n-1));
		sc.close();
	}
}
