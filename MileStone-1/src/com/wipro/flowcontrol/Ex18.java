package com.wipro.flowcontrol;

public class Ex18 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=a;
		int rev=0,n;
		while(b>0)
		{
			n=b%10;
			rev=rev*10+n;
			b=b/10;
		}
		if(a==rev)
			System.out.println(a+" is a palindrome");
		else
			System.out.println(a+" is not a palindrome");
	}
}
