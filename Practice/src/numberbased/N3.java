package numberbased;

public class N3 {
	static void sumofsqs(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i*i*i;
		}
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		sumofsqs(n);
	}
}
