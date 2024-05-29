import java.util.*;
class TrailingZeros
{
	public static void main(String args[])
	{
		long count=0;
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();
		if(n<0)
		{
			count=-1;
		}
		else
		{
			for(int i=5;n/i>=1;i*=5)
			{
				count+=n/i;
			}
		}
		System.out.print(count);
	}
}