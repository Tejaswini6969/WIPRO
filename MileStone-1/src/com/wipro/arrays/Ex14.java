package com.wipro.arrays;

public class Ex14 {
	public static void main(String args[])
	{
		if(args.length<9)
			System.out.println("Please enter 9 integers");
		else
		{
			int a[][]=new int[3][3];
			int i,j,k=0;
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					a[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
			System.out.println("The given array is:");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			int max=a[0][0];
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					if(a[i][j]>max)
						max=a[i][j];
				}
			}
			System.out.println("The biggest number is:"+max);
		}
	}

}
