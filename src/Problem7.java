
public class Problem7
{
	public static void main(String[] args)
	{
		int i = 1;
		int n = 2;
		while(i < 10001)
		{
			if(isPrimeOver2(++n))
			{
				System.out.println(n);
				i++;
			}
		}
		System.out.println(isPrimeOver2(4));
	}
	
	public static boolean isPrimeOver2(int n)
	{
		for(int i = 2; i <= Math.sqrt(n); i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
