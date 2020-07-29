package com.wipro.flowcontrol;

public class Ex3 {
	public static void main(String args[])
	{
		int i;
		if(args.length==0)
				System.out.println("No values");
		else {
			 for(i=0;i<args.length;i++)     
	                System.out.print(args[i]+" , ");
		}
	}
}
