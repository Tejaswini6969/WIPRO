package patterns;

public class P13 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int i,j,k=5;
		for(i=n;i>0;i--)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(k+"  ");
				k++;
			}
			System.out.println();
		}
	}
}
