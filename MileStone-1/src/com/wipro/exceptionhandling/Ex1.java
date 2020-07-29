package com.wipro.exceptionhandling;
import java.util.*;
public class Ex1 {
	public static void main(String args[])
	{
	int n,i,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements in the array:");
	n=sc.nextInt();
	int[] a=new int[n];
	try
	{
	System.out.println("Enter elements in the array:");	
	for(i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("Enter the index of the array element you want to access:");
	k=sc.nextInt();
	System.out.println("The array at element at index "+k+"="+a[k]);
	System.out.println("The array element successfully accessed");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("java.lang.ArrayIndexOutOfBoundsException");
	}
	catch(InputMismatchException e)
	{
		System.out.println("java.lang.InputMismatchException");
	}
	sc.close();
	}
}
