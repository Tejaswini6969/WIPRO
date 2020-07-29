package com.wipro.overriding;
class Fruit
{
	String name,taste,size;
	Fruit()
	{
		name="Watermelon";
		taste="Sweet";
		size="Big";
	}
	public void eat()
	{
		System.out.println(name+" Taste like "+taste);
	}
}

class Apple extends Fruit
{
	public void eat()
	{
		System.out.println("It tastes like Apple");
	}
}
class Orange extends Fruit
{
	public void eat()
	{
		System.out.println("It tastes like Orange");
	}
}
public class Test 
{
	public static void main(String args[])
	{
		Fruit f=new Fruit();
		Apple a =new Apple();
		Orange o=new Orange();
		f.eat();
		a.eat();
		o.eat();
	}
}
