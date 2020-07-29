package com.wipro.arrays;

public class Ex10 {
	public static void main(String args[])
	{
		int a[]= {2,7,9,5,6,8};
		int ce=0,i;
		int co=a.length-1;
		int[] tmp=new int[a.length]; 
		for (i=0;i<a.length;i++) 
		{
		    if (a[i] % 2 == 0)
		    {
		      tmp[ce]=a[i];
		      ce++;
		    } 
		    else {
		      tmp[co]=a[i];
		      co--;
		    }
		  }
		for(i=0;i<tmp.length;i++)
			System.out.print(tmp[i]+" ");
	}

}
