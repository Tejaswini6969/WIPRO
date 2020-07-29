package patterns;

public class P12 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k;
		for(i=n;i>0;i--)
		{
			k=n;
			for(j=1;j<=i;j++) 
			{
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
	}
}
