package com.wipro.flowcontrol;

public class Ex14 {
	public static void main(String args[])
	{
		int i,a=0,flag=0;
		if(args.length==0)
			  System.out.println("Please enter an integer number");
		int n=Integer.parseInt(args[0]); 
		a=n/2; 
		  if(n==0)
			  System.out.println(n+" is neither prime nor composite");
		  else if(n==1)
			  System.out.println(n+" is neither prime nor composite");
		  else
		  {
		   for(i=2;i<=a;i++)
		   {    
		    if(n%i==0)
		    {    
		    	System.out.println(n+" is not prime number");    
		    	flag=1; 
		    	break;    
		    }    
		   }    
		   if(flag==0)
			   System.out.println(n+" is prime number"); 
		  }
	}

}
