package com.wipro.abstraction;
import java.util.Random;
class FirstClass extends Compartment
{
	public String notice()
	{
		return "This is FirstClass Compartment";
	}
}
class Ladies extends Compartment
{
	public String notice()
	{
		return "This is Ladies Compartment";
	}
}
class General extends Compartment
{
	public String notice()
	{
		return "This is General Compartment";
	}
}
class Luggage extends Compartment
{
	public String notice()
	{
		return "This is Luggage Compartment";
	}
}
public class TestCompartment {
	public static void main(String args[])
	{
		Compartment[] c=new Compartment[10];
		Random rand=new Random();
		int rnd=0;
	    for (int i = 0; i < 10; i++) {
	    	rnd=rand.nextInt(4);
	    	if (rnd==0)
	    		c[i] = new FirstClass();
	    	else if(rnd==1)
	    		c[i]=new Ladies();
	    	else if(rnd==2)
	    		c[i]=new General();
	    	else
	    		c[i] = new Luggage();
	    	System.out.println("Notice:"+c[i].notice());
	    }
	}
}
