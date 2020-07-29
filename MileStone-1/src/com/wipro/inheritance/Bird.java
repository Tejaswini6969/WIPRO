package com.wipro.inheritance;

class Animal
{
	public void eat()
	{
		System.out.println("Animal Eat()");
	}
	public void sleep()
	{
		System.out.println("Animal Sleep()");
	}
}
public class Bird extends Animal
{
		public void eat()
		{
			System.out.println("Bird Eat()");
		}
		public void sleep()
		{
			System.out.println("Bird Sleep()");
		}
		public void fly()
		{
			System.out.println("Bird Fly()");
		}
		
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}

}
