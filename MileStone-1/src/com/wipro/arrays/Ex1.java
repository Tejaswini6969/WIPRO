package com.wipro.arrays;

public class Ex1 {
	public static void main(String args[])
	{
		int a[]=new int[] {10,22,35,42,57,67};
		int i,sum=0,avg;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		avg=sum/6;
		System.out.println(avg);
	}

}
