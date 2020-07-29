package com.wipro.strings;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) 
	{
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		a=sc.next();
		int m=a.length();
		System.out.println("Enter number of times to repeat:");
		int n=sc.nextInt();
		b="";
		for(int i=0;i<n;i++)
			b=b+a.substring(m-n,m);
		System.out.println("The final string is:"+b);
		sc.close();
	}
}
