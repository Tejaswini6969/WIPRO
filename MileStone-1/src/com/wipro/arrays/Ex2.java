package com.wipro.arrays;

public class Ex2 {
	public static void main(String args[])
	{
		int a[]=new int[] {1025,3422,6435,242,567,69887};
		int i,min,max;
		min=a[0];
		max=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
			if(a[i]>max)
				max=a[i];
		}
		System.out.println("Maximum value:"+max);
		System.out.println("Minimum value:"+min);
	}

}
