public class Problem3
{
	public static void main(String[] args)
	{
		System.out.println(largestPrimeFactor(13195L));
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static long largestPrimeFactor(long n)
	{
		for(long i = (long) Math.sqrt(n); i > 1; i--)
		{
			if(n % i == 0 && isPrimeOver2(i))
			{
				return i;
			}
		}
		return -1;
	}

	/**
	 * Prime number test for values over 2.
	 * @param n number
	 * @return isPrime?
	 */
	public static boolean isPrimeOver2(long n)
	{
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
