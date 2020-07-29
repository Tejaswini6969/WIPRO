package com.wipro.arrays;

public class Ex9 {
	public static void main(String args[])
	{
		int a[]= {1, 99, 10,10,10,30,10,10,20,5,6};
		int tmp[]=new int[40];
		int i,j=0,c=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==10)
				c++;
			else
			{
				tmp[j]=a[i];
				j++;
			}
		}
		for(i=0;i<c;i++)
		{
			tmp[j+i]=0;
		}
		for(i=0;i<j+c;i++)
			System.out.print(tmp[i]+" ");
	}

}
