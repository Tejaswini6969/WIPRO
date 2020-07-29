package numberbased;

public class N1 {
	static void sumofnumbers(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		sumofnumbers(n);
	}
}
