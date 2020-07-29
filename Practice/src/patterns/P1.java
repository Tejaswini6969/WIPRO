package patterns;

public class P1 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
