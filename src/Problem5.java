import java.util.LinkedList;

public class Problem5
{
	public static void main(String[] args)
	{
		System.out.println(minValue2(20));
	}

	public static Integer[] generatePrimes(int maxValue)
	{
		LinkedList<Integer> primes = new LinkedList<Integer>();
		if(maxValue > 2)
		{
			primes.add(2);
		}
		
		for(int i = 3; i < maxValue; i += 2)
		{
			if(isPrimeOver2(i))
			{
				primes.add(i);
			}
		}
		
		return primes.toArray(new Integer[primes.size()]);
	}
	
	public static int minValue2(int divisors)
	{
		Integer[] primes = generatePrimes(divisors);
		int product = 1;
		for(int i = 0; i < primes.length; i++)
		{
			int a = (int) Math.floor((Math.log(divisors) / Math.log(primes[i])));
			product *= (int) Math.pow(primes[i], a);
		}
		return product;		
	}

	public static int minValue1(int divisors)
	{
		for (int i = 20; i < Integer.MAX_VALUE; i += divisors)
		{
			boolean divisible = true;
			for (int j = divisors; j > 1; j--)
			{
				if (i % j != 0)
				{
					divisible = false;
				}
			}
			if (divisible)
			{
				return i;
			}
		}
		return -1;
	}

	public static boolean isPrimeOver2(int n)
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
