package com.wipro.classandobjects;

public class Box {
	double width,height, depth,vol;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume()
	{
		vol=width*height*depth;
		return vol;
	}
	public static void main(String args[])
	{
		Box b=new Box(23.5,65.4,78.9);
		b.volume();
		System.out.println(b.vol);
	}
}
