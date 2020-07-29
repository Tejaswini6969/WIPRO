package com.wipro.arrays;

public class Ex6 {
	public static void main(String args[])
	{
		int i,j,tmp;
		int ar[]= {56,34,78,98,69,23};
		for(i=0;i<ar.length;i++)
		{
			for(j=i;j>0;j--)
			{
				if(ar[j]<ar[j-1])
				{
					tmp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=tmp;
				}
			}
		}
		 System.out.println("Array after sorting:");
		for (i=0;i<ar.length;i++)
		{
		     System.out.println(ar[i]);
		}
	}

}
