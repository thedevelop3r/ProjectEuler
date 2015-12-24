/**
 * Summation of Primes under 2,000,000
 * @author Robert James Meade
 *
 */
public class Problem10
{
	public static void main(String[] args)
	{
		long sum = 2L;
		for(int i = 3; i < 2000001; i += 2)
		{
			if(isPrimeOver2(i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
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
