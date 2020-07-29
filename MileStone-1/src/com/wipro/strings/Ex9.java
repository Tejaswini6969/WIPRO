package com.wipro.strings;
import java.util.Scanner;
public class Ex9 
{
	public static void main(String[] args) 
	{
		String a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String-a:");
		a=sc.next();
		System.out.println("Enter the String-b:");
		b=sc.next();
		int n=a.length();
		int m=b.length();
		c="";
		if(m>n||m==n)
		{
		for(int i=0;i<n;i++)
		{
			Character d=a.charAt(i);
			Character e=b.charAt(i);
			c=c+d+e;
		}
		}
		if(m<n)
		{
			for(int i=0;i<m;i++)
			{
				Character d=a.charAt(i);
				Character e=b.charAt(i);
				c=c+d+e;
			}
		}
		if(m>n)
			c=c+b.substring(n,m);
		else if(m<n)
			c=c+a.substring(m,n);
		System.out.println(c);
		sc.close();
	}
}
