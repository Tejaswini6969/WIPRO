package com.wipro.flowcontrol;

public class Ex17 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int rev=0,n;
		while(a>0)
		{
			n=a%10;
			rev=rev*10+n;
			a=a/10;
		}
		System.out.println(rev);
	}
}
