package patterns;

public class P16 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k=n;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<n;j++)
				System.out.print(" ");
			for(j=1;j<=i;j++)
				System.out.print(k);
			System.out.println();
			k--;
		}
	}
}
