package com.wipro.arrays;

public class Ex3 {
	public static void main(String args[])
	{
		int a[]=new int[] {125,322,435,22,507,89,95,887,543,756,649};
		int i,search=435;
		int flag=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println(i);
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println(-1);
	}

}
