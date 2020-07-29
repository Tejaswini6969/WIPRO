package com.wipro.arrays;
import java.util.Arrays;

public class Ex7 {
	public static void main(String args[]) {
		int a[]= {12,55,34,12,45,55,67,89,67};
		Arrays.sort(a);
		int i,j,n;
		n=a.length;
		int tmp[]=new int[n];
		j=0;
		for(i=0;i<n-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				tmp[j++]=a[i];
			}
		}
		tmp[j++]=a[n-1];
		for(i=0;i<j;i++)
			a[i]=tmp[i];
		for(i=0;i<j;i++)
			System.out.print(a[i]+",");
	}

}
