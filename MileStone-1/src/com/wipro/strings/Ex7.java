package com.wipro.strings;
import java.util.Scanner;
public class Ex7 {
	public static void main(String[] args) 
	{
		String a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		a=sc.next();
		int n=a.length();
		if((a.substring(0, 1)).equals("x")&&(a.substring(n-1, n)).equals("x"))
			System.out.println("The final string is:"+a.substring(1,n-1));
		else
			System.out.println("The unchanged string is:"+a);
		sc.close();
	}

}
