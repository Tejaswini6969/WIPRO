package com.wipro.flowcontrol;

public class Ex5 {
	public static void main(String args[])
	{
		char a='T';
		if((a>=65&&a<=90)||(a>=97&&a<=122)) 
            System.out.println(" Alphabet ");
		else if(a>=45&&a<=57)
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}
}
