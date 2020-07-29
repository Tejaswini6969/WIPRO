package numberbased;

public class N2 {

	static void sumofno(int n)
	{
		int sum;
		sum=(n*(n+1))/2 ;
		System.out.println(sum);
	}		
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
	    sumofno(n);
	}
}
