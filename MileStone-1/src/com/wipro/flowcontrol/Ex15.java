package com.wipro.flowcontrol;

public class Ex15 {
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int sum=0,n;
		while(a>0)
		{
			n=a%10;
			sum=sum+n;
			a=a/10;
		}
		System.out.println(sum);
	}
}
