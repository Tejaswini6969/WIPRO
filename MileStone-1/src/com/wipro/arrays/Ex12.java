package com.wipro.arrays;

public class Ex12 {
	public static void main(String args[])
	{
		int a[]= {4,2,6};
		int b[]= {3,7,4};
		int p=a.length/2;
		int q=b.length/2;
		int c[]= {a[p],b[q]};
		System.out.println(c[0]+" "+c[1]);
		
	}

}
