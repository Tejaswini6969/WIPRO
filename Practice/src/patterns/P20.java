package patterns;

public class P20 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,l=6,k;
		for(i=1;i<=n;i++)
		{
			for(k=0;k<l;k++)
				System.out.print(" ");
			l=l-1;
			for(j=n;j>i;j--)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
}