package com.wipro.arrays;
import java.util.Arrays;
public class Ex5 {
	public static void main(String args[])
	{
		int a[]= {134,324,789,23,98,432,37,421,785};
		int max1,max2,min1,min2;
		Arrays.sort(a);
		min1=a[0];
		min2=a[1];
		max1=a[8];
		max2=a[7];
		System.out.println("First Maximum value:"+max1);
		System.out.println("Second Maximum value:"+max2);
		System.out.println("First Minimum value:"+min1);
		System.out.println("Second Minimum value:"+min2);
	}	

}
