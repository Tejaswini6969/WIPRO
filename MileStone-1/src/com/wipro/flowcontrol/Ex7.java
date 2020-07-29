package com.wipro.flowcontrol;

public class Ex7 {
	public static void main(String args[])
	{
		char a='K';
		if(a>=97&&a<=122)
			System.out.println(a+"->"+Character.toUpperCase(a));
		else if(a>=65&&a<=97)
			System.out.println(a+"->"+Character.toLowerCase(a));
	}

}
