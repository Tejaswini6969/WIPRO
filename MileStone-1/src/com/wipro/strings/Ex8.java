package com.wipro.strings;
import java.util.Scanner;
public class Ex8 
{
	public static void main(String[] args) 
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		a=sc.next();
		int n=a.length();
	    int a1=a.indexOf("*");
	    a=a.substring(0,a1-1)+a.substring(a1+2,n);
	    System.out.println(a);
	    sc.close();
	}
}
