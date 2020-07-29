package com.wipro.exceptionhandling;
class InvalidCountryException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidCountryException(String s)
	{
		super(s);
	}
}
public class UserRegistration {
	static void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(!userCountry.equals("India"))
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
		else if(userCountry.equals("India"))
				System.out.println("User registration done successfully");			
	}
	public static void main(String args[])
	{
		try
		{
		registerUser("Mini","Malaysia");
		}
		catch(InvalidCountryException c)
		{
			System.out.println(c);
		}
	}
}
