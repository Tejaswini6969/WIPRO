package patterns;

public class P9 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k=1;
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++)
				System.out.print(k+" ");
			System.out.println();
			k++;
		}
	}
}
