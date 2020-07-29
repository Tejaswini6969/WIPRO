package com.wipro.exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
class NegativeValueException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	NegativeValueException(String s)
	{
		super(s);
	}
}
class OutOfRangeException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	OutOfRangeException(String s)
	{
		super(s);
	}
}
public class NumberExcep
{
	
	public static void main(String args[]) throws NegativeValueException,OutOfRangeException
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String name1,name2;
		int sum1=0,sum2=0,i;
		try
		{
		System.out.println("Enter the name of the student-1:");
		name1=sc.next();
		System.out.println("Enter 3 subjects marks of the student-1:");
		int[] m=new int[3];
		for(i=0;i<3;i++)
		{
			m[i]=sc.nextInt();
			if(m[i]<0)
				throw new NegativeValueException("No negative values allowed");
			else if(m[i]>100)
				throw new OutOfRangeException("Greater than 100 not allowed");
			else
				sum1=sum1+m[i];
		}
		System.out.println("Enter the name of the student-2:");
		name2=sc.next();
		System.out.println("Enter 3 subjects marks of the student-2:");
		int[] m1=new int[3];
		for(i=0;i<3;i++)
		{
			m1[i]=sc.nextInt();
			if(m1[i]<0)
				throw new NegativeValueException("No negative values allowed");
			else if(m1[i]>100)
				throw new OutOfRangeException("Greater than 100 not allowed");
			else
				sum2=sum2+m[i];
		}
		System.out.println("Average marks of "+name1+" and "+name2+":"+(sum1+sum2)/2);
		sc.close();
		}
		catch(InputMismatchException f)
		{
			System.out.println("java.lang.InputMismatchException");
		}
		catch(NegativeValueException e)
		{
			System.out.println(e);
		}
		catch(OutOfRangeException o)
		{
			System.out.println(o);
		}
	}
}
