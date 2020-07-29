package patterns;

public class P18 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,l=6,k;
		for(i=n;i>0;i--)
		{
			for(k=0;k<l;k++)
				System.out.print(" ");
			l=l-1;
			for(j=i;j<=n;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
