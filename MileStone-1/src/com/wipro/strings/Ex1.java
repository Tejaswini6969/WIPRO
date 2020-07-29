package com.wipro.strings;
import java.util.Scanner;
public class Ex1 {
	private static Scanner sc;
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		String s;
		System.out.println("Enter the string:");		
		s=sc.next();
		int i,n;
		n=s.length();
		String a="";
		for(i=n-1;i>=0;i--)
		{
			a=a+s.charAt(i);
		}
		if(s.equals(a))
		{
			System.out.println("The given string is palindrome");
		}
		else
			System.out.println("The given string is not a palindrome");
		sc.close();
	}
}
