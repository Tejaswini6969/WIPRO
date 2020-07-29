package com.wipro.arrays;

public class Ex8 {
	public static void main(String args[])
	{
		int a[]= {7,7,3,10,3,5,1,2,7,9};
		int i,sum=0,sum1=0,flag=0;
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]==6)
			{
				if(i==a.length-1)
				{
					break;
				}
				else
				{
		while(a[i]!=7)
		{
				sum1=sum1+a[i];
				flag=1;
				i++;
		}
				}
		break;
			}
		}
		if(flag==0)
			System.out.println(sum);
		else
			System.out.println(Math.abs(sum-sum1-7));
	}

}
