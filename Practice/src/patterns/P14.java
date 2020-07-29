package patterns;

public class P14 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++) 
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
