package com.wipro.strings;
import java.util.Scanner;
public class Ex2 {
	public static void main(String args[])
	{
		String a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string a:");
		a=sc.next();
		System.out.println("Enter string b:");
		b=sc.next();
		int m=a.length();
		int n=b.length();
		if((a.substring(m-1,m)).equals(b.substring(0,1)))
			a=a+b.substring(1,n);
		else
			a=a.concat(b);
		System.out.println("The string after concatenation is:"+a.toLowerCase());
		sc.close();
	}
}