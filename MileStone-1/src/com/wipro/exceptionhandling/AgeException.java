package com.wipro.exceptionhandling;
class InvalidAgeException extends Exception
{
	private static final long serialVersionUID = 1L;

	InvalidAgeException(String s)
	{
		super(s);
	}
}
public class AgeException {
	public static void main(String args[])throws InvalidAgeException
	{
		try
		{
		String name=args[0];
		int age=Integer.parseInt(args[1]);
		if(age>=18&&age<60)
			System.out.println("Name:"+name+"\tAge:"+age);
		else
			throw new InvalidAgeException("Age must be only in between 18 to 60");
		}
		catch(InvalidAgeException i)
		{
			System.out.println(i);
		}
	}
}
