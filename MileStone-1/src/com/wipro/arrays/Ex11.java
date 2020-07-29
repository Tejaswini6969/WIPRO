package com.wipro.arrays;

public class Ex11 {
	public static void main(String args[])
	{
		int a[]= {1,4,1,4,4};
		int i,flag=0;
		for(i=0;i<a.length;i++) {
			if(a[i]==1||a[i]==4)
			{
				
			}
			else
			{
				System.out.println("false");
				flag=1;
				break;
			}
				
		}
		if(flag==0)
			System.out.println("true");
	}

}
