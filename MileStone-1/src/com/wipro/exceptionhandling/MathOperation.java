package com.wipro.exceptionhandling;

public class MathOperation 
{
	public static void main(String args[])
	{
		int sum=0;
		double avg;
		int[] a=new int[5];
		try
		{
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			sum=sum+a[i];
		}
		avg=(double)(sum)/5;
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+avg);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("java.lang.NumberFormatException");
		}
	}
}
