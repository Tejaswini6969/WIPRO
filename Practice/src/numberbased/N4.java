package numberbased;
public class N4 {
    public static void main(String[] args) {
        int fd,ld,c=0,i;
        for(i=100;i<=110;i++)
        {
        	ld=i%10;
        	while(i>0)
        		i=i/10;
        	fd=i;
        	if(fd==1||ld==7||fd==7||ld==1)
        	{
        		c++;
        		System.out.println(i);
        	}
        }
        System.out.println("Number of integers that contains 1 and 7 as its first or last digit:"+c);
    }
}
